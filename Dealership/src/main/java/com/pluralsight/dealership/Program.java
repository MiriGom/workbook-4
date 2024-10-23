package com.pluralsight.dealership;

import java.util.ArrayList;
import java.util.List;

import static com.pluralsight.dealership.DealershipFileManager.getDealership;

public class Program {
    private static List<Vehicle> inventory;

    public static void main(String[] args){
        getDealership();
        for (Vehicle vehicle : inventory) {
            System.out.println(vehicle);
        }

    }
}
