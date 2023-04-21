package com.demo.MyRestAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyRestApiApplication.class, args);
		System.out.println("*** MyRestAPI Application is running");
		System.out.println("*** Operating System: " + System.getProperty("os.name"));
	    System.out.println("*** Java runtime version: " + System.getProperty("java.runtime.version" ));
	}

}
