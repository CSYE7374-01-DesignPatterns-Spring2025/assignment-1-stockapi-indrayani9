package edu.neu.csye7374;

public class HermesBearMarketStrategy implements StockPriceStrategy {

    @Override
    public void updatePrice(StockAPI stock, double bid) {
        // HermesStock in Bear Market: Reacts less aggressively to positive bids
        stock.setPrice(stock.getPrice() + 0.8 * (bid - stock.getPrice()));
    }
}
