package com.api_rest_springboot_gitaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiRestSpringbootGitactionApplication {

	public String saludor(){
		return "Ejemplo de gitaction";
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiRestSpringbootGitactionApplication.class, args);
	}

}
