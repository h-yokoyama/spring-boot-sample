package com.example.multidbinstance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.multidbinstance.application.MigrationService;

@SpringBootApplication
public class MultidbinstanceApplication implements CommandLineRunner {

	@Autowired
	private MigrationService service;
	
	public static void main(String[] args) {
		SpringApplication.run(MultidbinstanceApplication.class, args);
<<<<<<< HEAD
		System.out.println("終了４");
=======
		System.out.println("終了３");
>>>>>>> branch 'master' of https://github.com/h-yokoyama/spring-boot-sample.git
	}

	@Override
	public void run(String... args) throws Exception {	
		service.migrate1to2();
	}
}

