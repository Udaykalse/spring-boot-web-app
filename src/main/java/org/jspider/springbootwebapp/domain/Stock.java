package org.jspider.springbootwebapp.domain;

public class Stock {
    private int stockId;
    private String stockName;
    private double purchaseCost;
    private double sellCost;


    public Stock() {
    }

    public Stock(int stockId, String stockName, double purchaseCost, double sellCost) {
        this.stockId = stockId;
        this.stockName = stockName;
        this.purchaseCost = purchaseCost;
        this.sellCost = sellCost;
    }

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public double getPurchaseCost() {
        return purchaseCost;
    }

    public void setPurchaseCost(double purchaseCost) {
        this.purchaseCost = purchaseCost;
    }

    public double getSellCost() {
        return sellCost;
    }

    public void setSellCost(double sellCost) {
        this.sellCost = sellCost;
    }
}
