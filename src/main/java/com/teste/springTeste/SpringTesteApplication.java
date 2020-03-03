package com.teste.springTeste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAutoConfiguration
@EnableScheduling
public class SpringTesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTesteApplication.class, args);
		System.out.println("ola mundo");


	}


}
