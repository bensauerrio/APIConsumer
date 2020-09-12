package com.yahoofinanceapiconsumer.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yahoofinanceapiconsumer.business.FinanceQuote;
import com.yahoofinanceapiconsumer.service.YahooFinanceClientService;

@RestController
@RequestMapping("/quotes")
public class YahooFinanceApiResource {

	@Autowired
	private YahooFinanceClientService yahooFinanceClientService;

	@GetMapping
	public List<FinanceQuote> testGetMapping() {
		return this.yahooFinanceClientService.getAllValuesByParam("TLS.AX,MUS.AX");
	}

}
