package com.paiterdigital.hexagonalarchspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HexagonalArchSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HexagonalArchSpringApplication.class, args);
	}

}
