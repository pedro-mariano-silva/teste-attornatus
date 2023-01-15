package com.pedro.henrique.attornatus.teste.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.pedro.henrique.attornatus.teste.app.repository")

public class TesteAttornatusApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteAttornatusApplication.class, args);
	}

}
