package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SprngCloudConsulFeginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprngCloudConsulFeginApplication.class, args);
	}

}
