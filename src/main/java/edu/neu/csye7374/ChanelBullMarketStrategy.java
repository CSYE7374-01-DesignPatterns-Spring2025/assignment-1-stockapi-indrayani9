package edu.neu.csye7374;

public class ChanelBullMarketStrategy implements StockPriceStrategy {

    @Override
    public void updatePrice(StockAPI stock, double bid) {
        // ChanelStock in Bull Market: Reacts aggressively to positive bids
        stock.setPrice(stock.getPrice() + 1.5 * (bid - stock.getPrice()));
    }
}
