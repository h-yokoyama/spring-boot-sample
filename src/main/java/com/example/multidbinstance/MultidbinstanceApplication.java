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
		System.out.println("アプリケーションをstartします。");
		SpringApplication.run(MultidbinstanceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("start：service.migrate1to2()");
		System.out.println("start：service.migrate1to2()");
		System.out.println("start：service.migrate1to2()");
		System.out.println("start：service.migrate1to2()");
		System.out.println("start：service.migrate1to2()");
		
		service.migrate1to2();	
		System.out.println("end：service.migrate1to2()");
		System.out.println("end：service.migrate1to2()");
		System.out.println("end：service.migrate1to2()");
		System.out.println("end：service.migrate1to2()");
		System.out.println("end：service.migrate1to2()");
	}
}

