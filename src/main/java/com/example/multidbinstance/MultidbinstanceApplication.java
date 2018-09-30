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
		System.out.println("終了３");
	}

	@Override
	public void run(String... args) throws Exception {	
		service.migrate1to2();
	}
}

