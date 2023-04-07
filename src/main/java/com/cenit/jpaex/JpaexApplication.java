package com.cenit.jpaex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaexApplication implements CommandLineRunner {

	@Autowired
	StudentRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaexApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(repository.findAll());
	}

}
