package org.jspider.springbootwebapp.domain;

public class Laptop {
    private String laptopModel;
    private double laptopPrice;

    public Laptop(String laptopModel, double laptopPrice) {
        this.laptopModel = laptopModel;
        this.laptopPrice = laptopPrice;
    }


    public String getLaptopModel() {
        return laptopModel;
    }

    public void setLaptopModel(String laptopModel) {
        this.laptopModel = laptopModel;
    }

    public double getLaptopPrice() {
        return laptopPrice;
    }

    public void setLaptopPrice(double laptopPrice) {
        this.laptopPrice = laptopPrice;
    }
}
