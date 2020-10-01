package com.example.videogameservice;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.videogameservice.dto.Videogame;

@SpringBootApplication
public class VideogameServiceApplication {
	@Bean
	public RestTemplate buildRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public List<Videogame> buildVideogameList() {
		return Arrays.asList(
				new Videogame(1, "Super mario", 1),
				new Videogame(2, "Sonic the hedgehog", 2),
				new Videogame(3, "Zelda", 1),
				new Videogame(4, "Silent hill", 3)
		);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(VideogameServiceApplication.class, args);
	}

}
