package com.example.mygateway;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
@OpenAPIDefinition
public class MygatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MygatewayApplication.class, args);
	}

}