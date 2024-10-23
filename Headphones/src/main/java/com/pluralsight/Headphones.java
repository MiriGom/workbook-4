package com.pluralsight;

public class Headphones {
    private String brand;
    private String model;
    private Double price;
    private boolean wireless;

    Headphones(String brand, String model, double price, boolean bluetooth){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.wireless = true;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
