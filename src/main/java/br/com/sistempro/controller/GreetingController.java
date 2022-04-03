package br.com.sistempro.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.sistempro.configuration.GreetingConfiguration;
import br.com.sistempro.entities.Greeting;

@RestController
public class GreetingController {

	private static final String template = "%s, %s!";

	private final AtomicLong couter = new AtomicLong();
	
	//import da configuração para expor dinamicamente os dados no endpoint.	
	
	@Autowired
	private GreetingConfiguration configuration;

	@RequestMapping("/greeting")
	public Greeting greeting(
			@RequestParam(value = "name", 
			defaultValue = "") String name) {
		if(name.isEmpty()) {
			name = configuration.getDefaultValue();
		}
		return new Greeting(
				couter.incrementAndGet(), 
				String.format(template,configuration.getGreeting(), name));

	}
}
