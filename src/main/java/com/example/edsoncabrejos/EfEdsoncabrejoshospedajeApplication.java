package com.example.edsoncabrejos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class EfEdsoncabrejoshospedajeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfEdsoncabrejoshospedajeApplication.class, args);
	}

}
