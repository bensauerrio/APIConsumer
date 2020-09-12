package com.yahoofinanceapiconsumer.business;

import java.io.Serializable;
import java.util.List;

public class YahooQuoteResponse implements Serializable {

	private static final long serialVersionUID = 8035021097267216753L;

	private List<FinanceQuote> result;

	private String error;

	public YahooQuoteResponse() {
		super();
	}

	public YahooQuoteResponse(final List<FinanceQuote> result, final String error) {
		super();
		this.result = result;
		this.error = error;
	}

	public List<FinanceQuote> getResult() {
		return this.result;
	}

	public void setResult(final List<FinanceQuote> result) {
		this.result = result;
	}

	public String getError() {
		return this.error;
	}

	public void setError(final String error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "YahooFinanceResponse [result=" + this.result + ", error=" + this.error + "]";
	}

}
