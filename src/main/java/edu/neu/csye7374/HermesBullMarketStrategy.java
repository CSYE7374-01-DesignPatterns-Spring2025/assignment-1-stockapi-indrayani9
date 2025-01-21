package edu.neu.csye7374;

public class HermesBullMarketStrategy implements StockPriceStrategy {

    @Override
    public void updatePrice(StockAPI stock, double bid) {
        // HermesStock in Bull Market: Reacts aggressively to positive bids
        stock.setPrice(stock.getPrice() + 1.2 * (bid - stock.getPrice()));
    }
}
