package edu.neu.csye7374;

public interface Tradeable {
    /**
     * Places a bid to buy a stock and updates its price.
     * @param bid 
     */
    void setBid(String bid);

    /**
     * Calculates and returns the stock's performance metric.
     * A positive value indicates good performance, and a negative value indicates poor performance.
     * @return 
     */
    int getMetric();
}