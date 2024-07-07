package com.farm.collector;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CollectorApplication {
	/**
	 * Model mapper model mapper.
	 *
	 * @return the model mapper
	 */
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(CollectorApplication.class, args);
	}

}
