package com.bitcoin.bitcoinapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BitcoinApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BitcoinApiApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public CommandLineRunner run(BitcoinApiService bitcoinApiService) {
		return args -> {
			BitcoinData bitcoinData = bitcoinApiService.fetchAndDisplayBitcoinData();
			System.out.println("Raw Bitcoin Data:");
			System.out.println(bitcoinData);
		};
	}
}
