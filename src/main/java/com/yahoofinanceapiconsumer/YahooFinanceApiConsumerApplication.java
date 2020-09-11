package com.yahoofinanceapiconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class YahooFinanceApiConsumerApplication {

	private static final Logger log = LoggerFactory.getLogger(YahooFinanceApiConsumerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(YahooFinanceApiConsumerApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Finance finance = restTemplate.getForObject(
					"https://query1.finance.yahoo.com/v7/finance/quote?symbols=TLS.AX,MUS.AX", Finance.class);
			log.info(finance.toString());
		};
	}

}
