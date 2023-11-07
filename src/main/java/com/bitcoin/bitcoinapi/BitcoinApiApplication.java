package com.bitcoin.bitcoinapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BitcoinApiApplication {

	private static final Logger log = LoggerFactory.getLogger(BitcoinApiApplication.class);

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

			log.info("Raw Bitcoin Data:");
			log.info(bitcoinData.toString());
		};
	}
}
