package com.pedro.henrique.attornatus.teste.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.pedro.henrique.attornatus.teste.app.model.entity.Pessoa;
import com.pedro.henrique.attornatus.teste.app.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired	
	 private PessoaRepository pessoaRepository;
	
	public void salvar(Pessoa pessoa) {
		this.pessoaRepository.save(pessoa);
		
	}
	
	public Pessoa buscar(Long id) {
		
		return this.pessoaRepository.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Não foi encontrado pessoa com o ID informado!"));
				
	}
	
	public List<Pessoa> buscarTodos(){
		return this.pessoaRepository.findAll();
		
	}

}
