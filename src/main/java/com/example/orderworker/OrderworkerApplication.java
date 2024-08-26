package com.example.orderworker;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class OrderworkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderworkerApplication.class, args);
	}

}
