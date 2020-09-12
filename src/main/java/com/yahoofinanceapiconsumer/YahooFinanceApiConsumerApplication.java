package com.yahoofinanceapiconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YahooFinanceApiConsumerApplication {

	private static final Logger log = LoggerFactory.getLogger(YahooFinanceApiConsumerApplication.class);

	public static void main(final String[] args) {
		SpringApplication.run(YahooFinanceApiConsumerApplication.class, args);
	}

}
