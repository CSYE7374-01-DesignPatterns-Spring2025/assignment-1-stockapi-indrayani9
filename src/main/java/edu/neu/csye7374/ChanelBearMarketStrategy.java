package edu.neu.csye7374;

public class ChanelBearMarketStrategy implements StockPriceStrategy {

    @Override
    public void updatePrice(StockAPI stock, double bid) {
        // ChanelStock in Bear Market: Reacts less aggressively to positive bids
        stock.setPrice(stock.getPrice() + 0.6 * (bid - stock.getPrice()));
    }
}
