package com.example.getAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class GetApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetApiApplication.class, args);

		String url = "http://172.30.40.245:8080/v1/user/1";

		WebClient.Builder builder = WebClient.builder();

//		deneme
//		CatFact catFact = builder.build()
//				.get()
//				.uri(url)
//				.retrieve()
//				.bodyToMono(CatFact.class)
//				.block();

		String hello = builder.build()
				.get()
				.uri(url)
				.retrieve()
				.bodyToMono(String.class)
				.block();

		System.out.println("---------------------------------------------------------------");
		System.out.println(hello);
		System.out.println("---------------------------------------------------------------");


	}

}
