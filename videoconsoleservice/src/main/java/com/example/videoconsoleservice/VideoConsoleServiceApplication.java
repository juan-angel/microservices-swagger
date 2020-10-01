package com.example.videoconsoleservice;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.videoconsoleservice.dto.Videoconsole;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class VideoConsoleServiceApplication {
	@Bean
	public Docket buildSwaggerConfig() {
        return new Docket(DocumentationType.SWAGGER_2)  
                .select()
                .apis(RequestHandlerSelectors.any())              
                .paths(PathSelectors.any())                          
                .build();
	}

	@Bean
	public List<Videoconsole> buildVideoconsoleList() {
		return Arrays.asList(new Videoconsole(1, "NES", "Nintendo"),
				new Videoconsole(2, "Megadrive", "Sega"),
				new Videoconsole(3, "Playstation", null));
	}
	
	public static void main(String[] args) {
		SpringApplication.run(VideoConsoleServiceApplication.class, args);
	}

}
