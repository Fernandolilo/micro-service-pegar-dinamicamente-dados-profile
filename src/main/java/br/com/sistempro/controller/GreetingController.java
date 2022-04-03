package br.com.sistempro.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.sistempro.entities.Greeting;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";

	private final AtomicLong couter = new AtomicLong();

	@RequestMapping("/greeting")
	public Greeting greeting(
			@RequestParam(value = "name", 
			defaultValue = "Word") String name) {
		return new Greeting(
				couter.incrementAndGet(), String.format(template, name));

	}
}
