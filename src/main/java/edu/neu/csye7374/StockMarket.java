package edu.neu.csye7374;

public class StockMarket {

    public void demo() {
        System.out.println("============Stock Market Demo Start===================\n\n");

        StockAPI chanelStock = new ChanelStock("CHANEL", 60, "Chanel");
        StockAPI hermesStock = new HermesStock("HERMES", 30, "Hermes");

        // Create market context
        MarketContext marketContext = new MarketContext();

        // Create specific strategies for each stock
        StockPriceStrategy chanelBullStrategy = new ChanelBullMarketStrategy();
        StockPriceStrategy chanelBearStrategy = new ChanelBearMarketStrategy();
        StockPriceStrategy hermesBullStrategy = new HermesBullMarketStrategy();
        StockPriceStrategy hermesBearStrategy = new HermesBearMarketStrategy();

        // Apply bull market strategies
        System.out.println("Applying Bull Market Strategy for CHANEL and HERMES...");
        marketContext.setMarketStrategy(chanelBullStrategy);

        String[] chanelBids = {"62", "59", "58", "67", "70", "72"};
        String[] hermesBids = {"31", "25", "30", "26", "33", "32"};

        System.out.println("Simulating market for CHANEL...");
        for (String bid : chanelBids) {
            marketContext.applyStrategy(chanelStock, bid);
            System.out.println(chanelStock);
            System.out.println("CHANEL Metric: " + chanelStock.getMetric());
        }

        marketContext.setMarketStrategy(hermesBullStrategy);

        System.out.println("\nSimulating market for HERMES...");
        for (String bid : hermesBids) {
            marketContext.applyStrategy(hermesStock, bid);
            System.out.println(hermesStock);
            System.out.println("HERMES Metric: " + hermesStock.getMetric());
        }

        // Apply bear market strategies
        System.out.println("\nApplying Bear Market Strategy for CHANEL and HERMES...");
        marketContext.setMarketStrategy(chanelBearStrategy);

        System.out.println("Simulating market for CHANEL in a bear market...");
        for (String bid : chanelBids) {
            marketContext.applyStrategy(chanelStock, bid);
            System.out.println(chanelStock);
            System.out.println("CHANEL Metric: " + chanelStock.getMetric());
        }

        marketContext.setMarketStrategy(hermesBearStrategy);

        System.out.println("\nSimulating market for HERMES in a bear market...");
        for (String bid : hermesBids) {
            marketContext.applyStrategy(hermesStock, bid);
            System.out.println(hermesStock);
            System.out.println("HERMES Metric: " + hermesStock.getMetric());
        }

        System.out.println("\n\n============Stock Market Demo End===================");
    }
}
