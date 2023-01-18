package com.pedro.henrique.attornatus.teste.app.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pedro.henrique.attornatus.teste.app.model.entity.Pessoa;
import com.pedro.henrique.attornatus.teste.app.service.PessoaService;

@RestController
public class PessoaController {
   
	@Autowired
	private PessoaService pessoaService;
	
	
	
	@PostMapping("/pessoas")
	public ResponseEntity<String> cadastrar(@RequestBody Pessoa pessoa){
		this.pessoaService.salvar(pessoa);
		return ResponseEntity.ok("Pessoa cadastrada com sucesso!");
		
		
		
	}
	
	@PostMapping("/enderecos")
	public ResponseEntity<String> cadastrarEndereco(@RequestBody Pessoa pessoa){
		this.pessoaService.salvar(pessoa);
		return ResponseEntity.ok("Endereço inserido com sucesso!");
		
		
		
	}
	
	
	@GetMapping("/pessoas/{id}")	
	public ResponseEntity<Pessoa> consultar(@PathVariable Long id){
		return ResponseEntity.ok(this.pessoaService.buscar(id));
		
	}
	
	@GetMapping("/pessoas")	
	public ResponseEntity<List<Pessoa>> listar(){
		return ResponseEntity.ok(this.pessoaService.buscarTodos());
		
		
	}
	
	@PutMapping("/pessoas")
	public ResponseEntity<String> atualizar(@RequestBody Pessoa pessoa){
		this.pessoaService.salvar(pessoa);
		return ResponseEntity.ok("Pessoa atualizada com sucesso!");
		
	
	
	}
	

	
	
}
