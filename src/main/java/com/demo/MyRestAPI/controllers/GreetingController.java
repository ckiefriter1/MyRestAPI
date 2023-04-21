package com.demo.MyRestAPI.controllers;

import com.demo.MyRestAPI.entities.Greeting; 
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Let's Spring know this class is a Rest Controller.
@RestController
public class GreetingController {

	private final AtomicLong counter = new AtomicLong();

	// REST API end-point for /greeting resource
	@GetMapping("/greeting")
	public Greeting greeting() {
		return new Greeting(counter.incrementAndGet(), "Hello World");
	}

}