package br.com.fuctura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.fuctura.model.Jogador;

@SpringBootApplication
public class OlamundoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlamundoApplication.class, args);
	}
	
	@Bean
	public Jogador getNean() {
		Jogador j = new Jogador("Sou um Bean");
		return j;
	}

}
