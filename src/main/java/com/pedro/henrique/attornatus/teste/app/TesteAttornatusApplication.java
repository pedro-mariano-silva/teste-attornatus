package com.pedro.henrique.attornatus.teste.app;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.pedro.henrique.attornatus.teste.app.repository")

public class TesteAttornatusApplication {

    @Bean
    ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setSkipNullEnabled(true);
        return modelMapper;

    }

	public static void main(String[] args) {
		SpringApplication.run(TesteAttornatusApplication.class, args);
	}

}
