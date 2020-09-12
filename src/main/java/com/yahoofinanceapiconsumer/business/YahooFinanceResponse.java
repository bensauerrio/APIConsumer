package com.yahoofinanceapiconsumer.business;

import java.io.Serializable;

public class YahooFinanceResponse implements Serializable {

	private static final long serialVersionUID = -3591334708441456967L;

	private YahooQuoteResponse quoteResponse;

	public YahooQuoteResponse getQuoteResponse() {
		return this.quoteResponse;
	}

	public void setQuoteResponse(final YahooQuoteResponse quoteResponse) {
		this.quoteResponse = quoteResponse;
	}

}
