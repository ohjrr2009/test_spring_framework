package br.com.radstudio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Essa classe é o ponto de entrada para a aplicação Spring Boot que será executada
 */
@SpringBootApplication
public class Startup {
	
	public static void main(String[] args) {
		//indica a classe inicial que será executada juntamente com os argumentos passados 
		SpringApplication.run(Startup.class, args);
	}
}
