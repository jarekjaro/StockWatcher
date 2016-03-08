package stockWatcher.client;

import java.io.Serializable;

/**
 * Created by Jaro on 2016-03-06.
 */
public class StockPrice implements Serializable {
    private String symbol;
    private double price;
    private double change;

    public StockPrice() {
    }

    public StockPrice(String symbol, double price, double change) {
        this.symbol = symbol;
        this.price = price;
        this.change = change;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getChange() {
        return this.change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public double getChangePercent() {
        return 100.0 * this.change / this.price;
    }
}
