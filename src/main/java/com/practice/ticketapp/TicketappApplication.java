package com.practice.ticketapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.practice.ticketapp")
public class TicketappApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketappApplication.class, args);
	}

}
