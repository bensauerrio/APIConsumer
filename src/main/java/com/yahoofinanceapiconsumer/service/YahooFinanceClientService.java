package com.yahoofinanceapiconsumer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import com.yahoofinanceapiconsumer.business.FinanceQuote;
import com.yahoofinanceapiconsumer.business.YahooFinanceResponse;

@Service
public class YahooFinanceClientService {

	private static final String BASE_PATH = "https://query1.finance.yahoo.com/v7/finance/";

	private static final String QUOTE_API_PATH = BASE_PATH.concat("quote");

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Autowired
	private RestTemplate restTemplate;

	public List<FinanceQuote> getAllValuesByParam(final String param) {
		final String path = QUOTE_API_PATH.concat(StringUtils.isEmpty(param) ? "" : "?symbols=" + param);
		final YahooFinanceResponse response = this.restTemplate.getForObject(path, YahooFinanceResponse.class);

		return response != null //
				&& response.getQuoteResponse() != null //
				&& response.getQuoteResponse().getResult() != null//
						? response.getQuoteResponse().getResult() //
						: new ArrayList<FinanceQuote>();
	}

}
