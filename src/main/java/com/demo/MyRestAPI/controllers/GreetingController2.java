package com.demo.MyRestAPI.controllers;

import com.demo.MyRestAPI.entities.Greeting; 
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class GreetingController2 {

	private final AtomicLong counter = new AtomicLong();
	private static final String template = "Hello, %s!";

	// REST API end-point for /greeting2 resource
	@GetMapping("/greeting2")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}