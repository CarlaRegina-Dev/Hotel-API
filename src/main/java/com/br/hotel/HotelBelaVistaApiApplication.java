package com.br.hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.br.hotel.mapper")
public class HotelBelaVistaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelBelaVistaApiApplication.class, args);
	}

}
