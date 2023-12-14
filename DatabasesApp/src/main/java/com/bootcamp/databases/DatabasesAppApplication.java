package com.bootcamp.databases;

import org.apache.log4j.BasicConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabasesAppApplication {
	
	
	
	public static void main(String[] args) {
		BasicConfigurator.configure(); //para el log
		SpringApplication.run(DatabasesAppApplication.class, args);
	}

}
