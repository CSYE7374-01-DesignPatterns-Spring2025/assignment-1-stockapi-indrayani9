package edu.neu.csye7374;

public class MarketContext {
    private StockPriceStrategy strategy; 

    public void setMarketStrategy(StockPriceStrategy strategy) {
        this.strategy = strategy;
    }

    public void applyStrategy(StockAPI stock, String bid) {
        if (this.strategy != null) {
            try {
                double bidValue = Double.parseDouble(bid);
                this.strategy.updatePrice(stock, bidValue); 
            } catch (NumberFormatException e) {
                System.out.println("Invalid bid value: " + bid);
            }
        } else {
            System.out.println("Strategy is not set. Please set a market strategy first.");
        }
    }
}
