package com.pluralsight.dealership;

//class name and its declared private variables
public class Vehicle {
    private int vin;
    private int year;
    private String make;
    private String model;
    private String vehicleType;
    private String color;
    private int odometer;
    private double price;

    //main constructor
    Vehicle(int vin, int year, String make, String model, String vehicleType, String color, int odometer, double price){
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }
    //Getters
    public int getVin() {
        return vin;
    }
    public int getYear() {
        return year;
    }
    public String getModel() {
        return model;
    }
    public String getMake() {
        return make;
    }
    public String getVehicleType() {
        return vehicleType;
    }
    public String getColor() {
        return color;
    }
    public int getOdometer() {
        return odometer;
    }
    public double getPrice() {
        return price;
    }

    //Setters
    public void setVin(int vin) {
        this.vin = vin;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Vin: %d, Year: %d, Model: %s, Make: %s, Color: %s, Car Type: %s, Odometer: %d, Price: %.2f\n",
                getVin(), getYear(), getModel(), getMake(), getColor(), getVehicleType(), getOdometer(), getPrice());
    }
}
