package hello;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.quotes.stock.StockQuote;

import java.io.IOException;

/**
 * Created by Anthony on 9/11/2015.
 * Testing it's ability to just output JSON
 */
public class CustomResult {

    private final String symbol;
    private final String companyName;
    private final String stockExchange;
    private final double avg200;
    private final double avg50;

    public CustomResult(String symbol) {
        this.symbol = symbol;

        Stock stock = null;
        StockQuote quote = null;

        try {
            stock = YahooFinance.get(symbol);
            quote = stock.getQuote();
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.companyName = stock.getName();
        this.stockExchange = stock.getStockExchange();
        this.avg200 = quote.getPriceAvg200().doubleValue();
        this.avg50 = quote.getPriceAvg50().doubleValue();
    }

    public String getSymbol() {
        return symbol;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getStockExchange() {
        return stockExchange;
    }

    public double getAvg200() {
        return avg200;
    }

    public double getAvg50() {
        return avg50;
    }
}
