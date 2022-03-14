package com.example.miniminishop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class MiniminishopApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniminishopApplication.class, args);
	}

}
