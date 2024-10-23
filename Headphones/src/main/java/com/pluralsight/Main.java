package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        String myFavoriteBrand = "JBL";
        String newestModel = "SK10000XLQ";
        double priceOnAmazon = 130.0;
        boolean bluetooth = true;

        Headphones myEarBuds = new Headphones(myFavoriteBrand, newestModel, priceOnAmazon, bluetooth);
        Headphones otherHeadset = new Headphones("ElCrummy", ".01", 4.00, false);

        printHeadphones(myEarBuds);
        printHeadphones(otherHeadset);
    }
    static void printHeadphones(Headphones h) {
        System.out.println(h.getBrand() + " has a new model " + h.getBrand());
    }

}
