package com.tomaskadlcek.RecipeAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecipeApiApplication {

	// if on server uncomment

	// extends SpringBootServletInitializer
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
//		return application.sources(MessengerApplication.class);
//	}

	public static void main(String[] args) {
		SpringApplication.run(RecipeApiApplication.class, args);
	}

}
