package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootTest
class ApplicationTests {
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext run=SpringApplication.run(Application.class);
		run.close();
	}
   }
 