package com.pedro.henrique.attornatus.teste.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pedro.henrique.attornatus.teste.app.model.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
