package edu.neu.csye7374;

public class HermesStock extends StockAPI {

    public HermesStock(String id, double price, String description) {
        super(id, price, description);
    }

    @Override
    public int getMetric() {
        // Metric: Performance based on proximity to $30
        return (int) (getPrice() - 30);
    }
}
