package com.pedro.henrique.attornatus.teste.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pedro.henrique.attornatus.teste.app.model.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	
	public List<Pessoa> findByNome(String nome);

}
