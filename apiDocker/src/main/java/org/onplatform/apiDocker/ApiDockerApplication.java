package org.onplatform.apiDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class ApiDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiDockerApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsCofigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				// registry.addMapping("/greeting-javaconfig").allowedOrigins("http://localhost:8080");
				registry.addMapping("/**").allowedOrigins("*");
			}
		};
	}
}
