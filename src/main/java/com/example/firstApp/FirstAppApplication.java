package com.example.firstApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.dependencyInjection.Laptop;

@EnableAutoConfiguration
@Configuration
@ComponentScan("com.example.dependencyInjection")
@SpringBootApplication
public class FirstAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstAppApplication.class, args);
		System.out.print("Testttt");

		  Laptop l = context.getBean(Laptop.class);
		l.print();

	}

}
