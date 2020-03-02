package com.teste.springTeste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringTesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTesteApplication.class, args);
		System.out.println("ola mundo");


	}


}
