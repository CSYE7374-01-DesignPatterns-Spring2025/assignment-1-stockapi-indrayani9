package edu.neu.csye7374;

public class ChanelStock extends StockAPI {

    public ChanelStock(String id, double price, String description) {
        super(id, price, description);
    }

    @Override
    public int getMetric() {
        // Metric: Performance based on proximity to $65
        return (int) (getPrice() - 65);
    }
}
