package com.pedro.henrique.attornatus.teste.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.pedro.henrique.attornatus.teste.app.model.entity.Endereco;
import com.pedro.henrique.attornatus.teste.app.model.entity.Pessoa;
import com.pedro.henrique.attornatus.teste.app.repository.PessoaRepository;

@DataJpaTest
public class TesteRepositorio {

 @Autowired	
 private PessoaRepository pessoaRepository;
 
 @Test
 void testePessoa() {
	 Pessoa pessoa = Pessoa.builder().dataNasc(LocalDate.of(1993, 05, 02)).nome("Pedro")
			 .enderecos(List.of(Endereco.builder()
					 .logradouro("Rua Teste1")
					 .numero("22").cep("0000-20")
					 .cidade("CidadeTeste1")
					 .endPrincipal(true).build(), Endereco.builder()
					 .logradouro("Rua Teste2")
					 .numero("05").cep("0000-50")
					 .cidade("CidadeTeste2")
					 .endPrincipal(false).build())).build();
	 for(Endereco endereco : pessoa.getEnderecos())
	 {
		 endereco.setPessoa(pessoa);
	 }
	 
	 pessoa= pessoaRepository.saveAndFlush(pessoa);
	 Pessoa pessoaResult = pessoaRepository.findById(pessoa.getId()).get();
	 
	assertEquals(pessoa.getNome(), pessoaResult.getNome());
 }
 

}
