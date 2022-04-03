package br.com.sistempro.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("greeting-service")
/*
 * @ConfigurationProperties("greeting-service") vai fazer o bind, com o arquivo
 * de configuração, seja YML ou PROPERTIES,
 * 
 */
public class GreetingConfiguration {

	private String greeting;
	private String defaultValue;

	public GreetingConfiguration() {
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

}
