package com.jbk;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class Supplier_RestAPI {
	public static void main(String[] args) {
		SpringApplication.run(Supplier_RestAPI.class, args);
	}
	
	 @Bean
	  public ModelMapper modelMapper() {
	    return new ModelMapper();
	  }
	 
	 
	 

}
