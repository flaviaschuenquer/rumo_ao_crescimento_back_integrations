package com.rumoaocrescimento.integrations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rumoaocrescimento.integrations.services.EmailService;
import com.rumoaocrescimento.integrations.services.MockEmailService;


@Configuration
@Profile("test")
public class TestConfig {
	
	@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}
	

}
