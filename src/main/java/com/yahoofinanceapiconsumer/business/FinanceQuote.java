package com.yahoofinanceapiconsumer.business;

import java.io.Serializable;

public class FinanceQuote implements Serializable {

	private static final long serialVersionUID = 5559768894136372173L;

	public String language;
	public String region;
	public String quoteType;
	public String quoteSourceName;
	public Boolean triggerable;
	public String currency;
	public String financialCurrency;
	public Double regularMarketOpen;
	public Long averageDailyVolume3Month;
	public Long averageDailyVolume10Day;
	public Double fiftyTwoWeekLowChange;
	public Double fiftyTwoWeekLowChangePercent;
	public String fiftyTwoWeekRange;
	public Double fiftyTwoWeekHighChange;
	public Double fiftyTwoWeekHighChangePercent;
	public Double fiftyTwoWeekLow;
	public Double fiftyTwoWeekHigh;
	public Long earningsTimestamp;
	public Long earningsTimestampStart;
	public Long earningsTimestampEnd;
	public Double trailingAnnualDividendRate;
	public Double trailingPE;
	public Double trailingAnnualDividendYield;
	public Double epsTrailingTwelveMonths;
	public Double epsForward;
	public Long sharesOutstanding;
	public Double bookValue;
	public Double fiftyDayAverage;
	public Double fiftyDayAverageChange;
	public Double fiftyDayAverageChangePercent;
	public Double twoHundredDayAverage;
	public Double twoHundredDayAverageChange;
	public Double twoHundredDayAverageChangePercent;
	public Long marketCap;
	public Double forwardPE;
	public Double priceToBook;
	public Long sourceInterval;
	public Long exchangeDataDelayedBy;
	public Boolean tradeable;
	public String exchange;
	public String shortName;
	public String marketState;
	public Long priceHint;
	public Long firstTradeDateMilliseconds;
	public Double regularMarketChange;
	public Double regularMarketChangePercent;
	public Long regularMarketTime;
	public Double regularMarketPrice;
	public Double regularMarketDayHigh;
	public String regularMarketDayRange;
	public Double regularMarketDayLow;
	public Long regularMarketVolume;
	public Double regularMarketPreviousClose;
	public Double bid;
	public Double ask;
	public Long bidSize;
	public Long askSize;
	public String fullExchangeName;
	public String longName;
	public String messageBoardId;
	public String exchangeTimezoneName;
	public String exchangeTimezoneShortName;
	public Long gmtOffSetMilliseconds;
	public String market;
	public Boolean esgPopulated;
	public String symbol;

	public FinanceQuote() {
		super();
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(final String language) {
		this.language = language;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(final String region) {
		this.region = region;
	}

	public String getQuoteType() {
		return this.quoteType;
	}

	public void setQuoteType(final String quoteType) {
		this.quoteType = quoteType;
	}

	public String getQuoteSourceName() {
		return this.quoteSourceName;
	}

	public void setQuoteSourceName(final String quoteSourceName) {
		this.quoteSourceName = quoteSourceName;
	}

	public Boolean getTriggerable() {
		return this.triggerable;
	}

	public void setTriggerable(final Boolean triggerable) {
		this.triggerable = triggerable;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(final String currency) {
		this.currency = currency;
	}

	public String getFinancialCurrency() {
		return this.financialCurrency;
	}

	public void setFinancialCurrency(final String financialCurrency) {
		this.financialCurrency = financialCurrency;
	}

	public Double getRegularMarketOpen() {
		return this.regularMarketOpen;
	}

	public void setRegularMarketOpen(final Double regularMarketOpen) {
		this.regularMarketOpen = regularMarketOpen;
	}

	public Long getAverageDailyVolume3Month() {
		return this.averageDailyVolume3Month;
	}

	public void setAverageDailyVolume3Month(final Long averageDailyVolume3Month) {
		this.averageDailyVolume3Month = averageDailyVolume3Month;
	}

	public Long getAverageDailyVolume10Day() {
		return this.averageDailyVolume10Day;
	}

	public void setAverageDailyVolume10Day(final Long averageDailyVolume10Day) {
		this.averageDailyVolume10Day = averageDailyVolume10Day;
	}

	public Double getFiftyTwoWeekLowChange() {
		return this.fiftyTwoWeekLowChange;
	}

	public void setFiftyTwoWeekLowChange(final Double fiftyTwoWeekLowChange) {
		this.fiftyTwoWeekLowChange = fiftyTwoWeekLowChange;
	}

	public Double getFiftyTwoWeekLowChangePercent() {
		return this.fiftyTwoWeekLowChangePercent;
	}

	public void setFiftyTwoWeekLowChangePercent(final Double fiftyTwoWeekLowChangePercent) {
		this.fiftyTwoWeekLowChangePercent = fiftyTwoWeekLowChangePercent;
	}

	public String getFiftyTwoWeekRange() {
		return this.fiftyTwoWeekRange;
	}

	public void setFiftyTwoWeekRange(final String fiftyTwoWeekRange) {
		this.fiftyTwoWeekRange = fiftyTwoWeekRange;
	}

	public Double getFiftyTwoWeekHighChange() {
		return this.fiftyTwoWeekHighChange;
	}

	public void setFiftyTwoWeekHighChange(final Double fiftyTwoWeekHighChange) {
		this.fiftyTwoWeekHighChange = fiftyTwoWeekHighChange;
	}

	public Double getFiftyTwoWeekHighChangePercent() {
		return this.fiftyTwoWeekHighChangePercent;
	}

	public void setFiftyTwoWeekHighChangePercent(final Double fiftyTwoWeekHighChangePercent) {
		this.fiftyTwoWeekHighChangePercent = fiftyTwoWeekHighChangePercent;
	}

	public Double getFiftyTwoWeekLow() {
		return this.fiftyTwoWeekLow;
	}

	public void setFiftyTwoWeekLow(final Double fiftyTwoWeekLow) {
		this.fiftyTwoWeekLow = fiftyTwoWeekLow;
	}

	public Double getFiftyTwoWeekHigh() {
		return this.fiftyTwoWeekHigh;
	}

	public void setFiftyTwoWeekHigh(final Double fiftyTwoWeekHigh) {
		this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
	}

	public Long getEarningsTimestamp() {
		return this.earningsTimestamp;
	}

	public void setEarningsTimestamp(final Long earningsTimestamp) {
		this.earningsTimestamp = earningsTimestamp;
	}

	public Long getEarningsTimestampStart() {
		return this.earningsTimestampStart;
	}

	public void setEarningsTimestampStart(final Long earningsTimestampStart) {
		this.earningsTimestampStart = earningsTimestampStart;
	}

	public Long getEarningsTimestampEnd() {
		return this.earningsTimestampEnd;
	}

	public void setEarningsTimestampEnd(final Long earningsTimestampEnd) {
		this.earningsTimestampEnd = earningsTimestampEnd;
	}

	public Double getTrailingAnnualDividendRate() {
		return this.trailingAnnualDividendRate;
	}

	public void setTrailingAnnualDividendRate(final Double trailingAnnualDividendRate) {
		this.trailingAnnualDividendRate = trailingAnnualDividendRate;
	}

	public Double getTrailingPE() {
		return this.trailingPE;
	}

	public void setTrailingPE(final Double trailingPE) {
		this.trailingPE = trailingPE;
	}

	public Double getTrailingAnnualDividendYield() {
		return this.trailingAnnualDividendYield;
	}

	public void setTrailingAnnualDividendYield(final Double trailingAnnualDividendYield) {
		this.trailingAnnualDividendYield = trailingAnnualDividendYield;
	}

	public Double getEpsTrailingTwelveMonths() {
		return this.epsTrailingTwelveMonths;
	}

	public void setEpsTrailingTwelveMonths(final Double epsTrailingTwelveMonths) {
		this.epsTrailingTwelveMonths = epsTrailingTwelveMonths;
	}

	public Double getEpsForward() {
		return this.epsForward;
	}

	public void setEpsForward(final Double epsForward) {
		this.epsForward = epsForward;
	}

	public Long getSharesOutstanding() {
		return this.sharesOutstanding;
	}

	public void setSharesOutstanding(final Long sharesOutstanding) {
		this.sharesOutstanding = sharesOutstanding;
	}

	public Double getBookValue() {
		return this.bookValue;
	}

	public void setBookValue(final Double bookValue) {
		this.bookValue = bookValue;
	}

	public Double getFiftyDayAverage() {
		return this.fiftyDayAverage;
	}

	public void setFiftyDayAverage(final Double fiftyDayAverage) {
		this.fiftyDayAverage = fiftyDayAverage;
	}

	public Double getFiftyDayAverageChange() {
		return this.fiftyDayAverageChange;
	}

	public void setFiftyDayAverageChange(final Double fiftyDayAverageChange) {
		this.fiftyDayAverageChange = fiftyDayAverageChange;
	}

	public Double getFiftyDayAverageChangePercent() {
		return this.fiftyDayAverageChangePercent;
	}

	public void setFiftyDayAverageChangePercent(final Double fiftyDayAverageChangePercent) {
		this.fiftyDayAverageChangePercent = fiftyDayAverageChangePercent;
	}

	public Double getTwoHundredDayAverage() {
		return this.twoHundredDayAverage;
	}

	public void setTwoHundredDayAverage(final Double twoHundredDayAverage) {
		this.twoHundredDayAverage = twoHundredDayAverage;
	}

	public Double getTwoHundredDayAverageChange() {
		return this.twoHundredDayAverageChange;
	}

	public void setTwoHundredDayAverageChange(final Double twoHundredDayAverageChange) {
		this.twoHundredDayAverageChange = twoHundredDayAverageChange;
	}

	public Double getTwoHundredDayAverageChangePercent() {
		return this.twoHundredDayAverageChangePercent;
	}

	public void setTwoHundredDayAverageChangePercent(final Double twoHundredDayAverageChangePercent) {
		this.twoHundredDayAverageChangePercent = twoHundredDayAverageChangePercent;
	}

	public Long getMarketCap() {
		return this.marketCap;
	}

	public void setMarketCap(final Long marketCap) {
		this.marketCap = marketCap;
	}

	public Double getForwardPE() {
		return this.forwardPE;
	}

	public void setForwardPE(final Double forwardPE) {
		this.forwardPE = forwardPE;
	}

	public Double getPriceToBook() {
		return this.priceToBook;
	}

	public void setPriceToBook(final Double priceToBook) {
		this.priceToBook = priceToBook;
	}

	public Long getSourceInterval() {
		return this.sourceInterval;
	}

	public void setSourceInterval(final Long sourceInterval) {
		this.sourceInterval = sourceInterval;
	}

	public Long getExchangeDataDelayedBy() {
		return this.exchangeDataDelayedBy;
	}

	public void setExchangeDataDelayedBy(final Long exchangeDataDelayedBy) {
		this.exchangeDataDelayedBy = exchangeDataDelayedBy;
	}

	public Boolean getTradeable() {
		return this.tradeable;
	}

	public void setTradeable(final Boolean tradeable) {
		this.tradeable = tradeable;
	}

	public String getExchange() {
		return this.exchange;
	}

	public void setExchange(final String exchange) {
		this.exchange = exchange;
	}

	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(final String shortName) {
		this.shortName = shortName;
	}

	public String getMarketState() {
		return this.marketState;
	}

	public void setMarketState(final String marketState) {
		this.marketState = marketState;
	}

	public Long getPriceHint() {
		return this.priceHint;
	}

	public void setPriceHint(final Long priceHint) {
		this.priceHint = priceHint;
	}

	public Long getFirstTradeDateMilliseconds() {
		return this.firstTradeDateMilliseconds;
	}

	public void setFirstTradeDateMilliseconds(final Long firstTradeDateMilliseconds) {
		this.firstTradeDateMilliseconds = firstTradeDateMilliseconds;
	}

	public Double getRegularMarketChange() {
		return this.regularMarketChange;
	}

	public void setRegularMarketChange(final Double regularMarketChange) {
		this.regularMarketChange = regularMarketChange;
	}

	public Double getRegularMarketChangePercent() {
		return this.regularMarketChangePercent;
	}

	public void setRegularMarketChangePercent(final Double regularMarketChangePercent) {
		this.regularMarketChangePercent = regularMarketChangePercent;
	}

	public Long getRegularMarketTime() {
		return this.regularMarketTime;
	}

	public void setRegularMarketTime(final Long regularMarketTime) {
		this.regularMarketTime = regularMarketTime;
	}

	public Double getRegularMarketPrice() {
		return this.regularMarketPrice;
	}

	public void setRegularMarketPrice(final Double regularMarketPrice) {
		this.regularMarketPrice = regularMarketPrice;
	}

	public Double getRegularMarketDayHigh() {
		return this.regularMarketDayHigh;
	}

	public void setRegularMarketDayHigh(final Double regularMarketDayHigh) {
		this.regularMarketDayHigh = regularMarketDayHigh;
	}

	public String getRegularMarketDayRange() {
		return this.regularMarketDayRange;
	}

	public void setRegularMarketDayRange(final String regularMarketDayRange) {
		this.regularMarketDayRange = regularMarketDayRange;
	}

	public Double getRegularMarketDayLow() {
		return this.regularMarketDayLow;
	}

	public void setRegularMarketDayLow(final Double regularMarketDayLow) {
		this.regularMarketDayLow = regularMarketDayLow;
	}

	public Long getRegularMarketVolume() {
		return this.regularMarketVolume;
	}

	public void setRegularMarketVolume(final Long regularMarketVolume) {
		this.regularMarketVolume = regularMarketVolume;
	}

	public Double getRegularMarketPreviousClose() {
		return this.regularMarketPreviousClose;
	}

	public void setRegularMarketPreviousClose(final Double regularMarketPreviousClose) {
		this.regularMarketPreviousClose = regularMarketPreviousClose;
	}

	public Double getBid() {
		return this.bid;
	}

	public void setBid(final Double bid) {
		this.bid = bid;
	}

	public Double getAsk() {
		return this.ask;
	}

	public void setAsk(final Double ask) {
		this.ask = ask;
	}

	public Long getBidSize() {
		return this.bidSize;
	}

	public void setBidSize(final Long bidSize) {
		this.bidSize = bidSize;
	}

	public Long getAskSize() {
		return this.askSize;
	}

	public void setAskSize(final Long askSize) {
		this.askSize = askSize;
	}

	public String getFullExchangeName() {
		return this.fullExchangeName;
	}

	public void setFullExchangeName(final String fullExchangeName) {
		this.fullExchangeName = fullExchangeName;
	}

	public String getLongName() {
		return this.longName;
	}

	public void setLongName(final String longName) {
		this.longName = longName;
	}

	public String getMessageBoardId() {
		return this.messageBoardId;
	}

	public void setMessageBoardId(final String messageBoardId) {
		this.messageBoardId = messageBoardId;
	}

	public String getExchangeTimezoneName() {
		return this.exchangeTimezoneName;
	}

	public void setExchangeTimezoneName(final String exchangeTimezoneName) {
		this.exchangeTimezoneName = exchangeTimezoneName;
	}

	public String getExchangeTimezoneShortName() {
		return this.exchangeTimezoneShortName;
	}

	public void setExchangeTimezoneShortName(final String exchangeTimezoneShortName) {
		this.exchangeTimezoneShortName = exchangeTimezoneShortName;
	}

	public Long getGmtOffSetMilliseconds() {
		return this.gmtOffSetMilliseconds;
	}

	public void setGmtOffSetMilliseconds(final Long gmtOffSetMilliseconds) {
		this.gmtOffSetMilliseconds = gmtOffSetMilliseconds;
	}

	public String getMarket() {
		return this.market;
	}

	public void setMarket(final String market) {
		this.market = market;
	}

	public Boolean getEsgPopulated() {
		return this.esgPopulated;
	}

	public void setEsgPopulated(final Boolean esgPopulated) {
		this.esgPopulated = esgPopulated;
	}

	public String getSymbol() {
		return this.symbol;
	}

	public void setSymbol(final String symbol) {
		this.symbol = symbol;
	}

}
