package com.example.EcommerceSpring;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EcommerceSpringApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure().load(); //load env variables from .env file

		dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue())); //sets system property

		SpringApplication.run(EcommerceSpringApplication.class, args);
	}

}
