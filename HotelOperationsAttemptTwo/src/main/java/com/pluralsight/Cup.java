package com.pluralsight;

public class Cup {
    private String color;
    private int size;
    private boolean full;
    private boolean withHandle;

    //Main constructor
    Cup(String color, int size, boolean full, boolean withHandle) {
        this.color = color;
        this.full = full;
        this.withHandle = withHandle;
        //  The following first checks that the size is a positive number
        this.size = size > 0 ? size : 1;
        //  Ternary operator (? :) is a shorthand "if-statement"
        //if (size > 0) { this.size = size;} else {this.size = 1;}
    }
    //Overloaded constructor with default values
    public Cup(String color, int size) {
        this(color, size, false, true);
    }
    //Overloaded constructor with only color
    public Cup(String color){
        this(color, 8, false, true);
    }
    //overloaded constructor with handle
    public Cup(boolean withHandle) {
        this("white", 8, false, withHandle);//Defaults: white color, size 8, not full.
    }
    public Cup(){
        this("Black", 8, false, true);
    }
    public Cup(String color, boolean withHandle){
        this(color, 8, false, withHandle);
    }
    public Cup(String color, boolean full, boolean withHandle){
        this(color, 8, full, withHandle);
    }

    //getters
    public String getColor() {
        return color;
    }
    public int getSize(){
        return size;
    }
    public boolean isFull(){
        return full;
    }
    public boolean isWithHandle(){
        return withHandle;
    }
    //method to empty cup
    public void emptyCup(){
        full = false;
    }
    //method to fill cup
    public void fillCup(){
        full = true;
    }

    @Override
    public String toString() {
        return String.format("Color: %s\nsize is %doz\nfull? %b\nDoes it have a handle? %b", getColor(),getSize(),isFull(),isWithHandle());
    }
}
