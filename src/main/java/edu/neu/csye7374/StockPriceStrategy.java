package edu.neu.csye7374;

public interface StockPriceStrategy {
    void updatePrice(StockAPI stock, double bid);
}
