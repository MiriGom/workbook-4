package com.pluralsight.dealership;
import java.util.ArrayList;
//Class and declared private variables
public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    //Main constructor
    Dealership(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
        //don't forget to initialize the arrayList with "new"
        this.inventory = new ArrayList<Vehicle>();
    }

    //Getters
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public ArrayList<Vehicle> getInventory() {
        return inventory;
    }


   //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //methods
    public void getVehiclesByPrice(){
    }
    public void getVehiclesByMakeModel() {

    }
    public void getVehiclesByYear() {

    }
    public void getVehiclesByColor() {

    }
    public void getVehiclesByMileage(){

    }
    public void getVehiclesByType(){

    }
    public void getAllVehicles(){

    }
    public void addVehicle() {

    }
    public void removeVehicle(){
        
    }
}
