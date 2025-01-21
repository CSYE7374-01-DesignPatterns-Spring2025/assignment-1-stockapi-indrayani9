package edu.neu.csye7374;

public class StockAPI implements Tradeable {
    protected String name;
    protected double price;
    protected String description;

    public StockAPI(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public void setBid(String bid) {
        try {
            double bidValue = Double.parseDouble(bid);
            this.price = bidValue;
        } catch (NumberFormatException e) {
            System.out.println("Invalid bid value: " + bid);
        }
    }

    @Override
    public String toString() {
        return "Stock [name=" + name + ", price=" + price + ", description=" + description + "]";
    }

    // Getter and Setter methods
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMetric() {
        return 0;
    }
}
