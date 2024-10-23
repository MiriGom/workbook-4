package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty, boolean available){
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = false;
        this.dirty = false;
        this.available = true;
    }
    public int getNumberOfBeds() {
        return numberOfBeds;
    }
    public double getPrice() {
        return price;
    }
    //checks if the room is occupied vs "occupy()" which changes state from vacancy and clean to Occupied and dirty
    public boolean isOccupied() {
        return occupied;
    }
    public boolean isDirty(){
        return dirty;
    }
    public boolean isAvailable() {
        return available && !dirty && !occupied;
    }
    public void occupy() {
        this.occupied = true;
        this.dirty = true;
        this.available = false;
    }
    public void vacate() {
        this.occupied = false;
        setDirty();
    }
    public void setDirty(){
        this.dirty = true;
    }
    public void cleanUp(){
        this.dirty = false;
        this.available = true;

    }
    /*
    public String convertToString() {
     return String.format("NUMBER OF BEDS: %d \nCOST PER NIGHT? $%.2f \nROOM OCCUPIED? %b \nROOM DIRTY? %b \nROOM AVAILABLE? %b\n", numberOfBeds, price, occupied, dirty, available);
    }*/

    @Override
    public String toString() {
        return "Room{" +
                "numberOfBeds=" + numberOfBeds +
                ", price=" + price +
                ", occupied=" + occupied +
                ", dirty=" + dirty +
                ", available=" + available +
                '}';
    }
}
