package com.pluralsight.dealership;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class DealershipFileManagerTest {
    public static void main(String[] args) {

       try {
           for (Vehicle vehicle : getVehicles()) {
               System.out.println(vehicle);
           }
       } catch (IOException e)  {
           System.out.println("file not found");
       }

    }
    static String filePath = "C:\\pluralsight\\workbook-4\\Dealership\\inventory.csv";

    public static List<Vehicle> getVehicles() throws IOException {
        List<Vehicle> inventory = new ArrayList<>();
         BufferedReader bufReader = new BufferedReader(new FileReader(filePath));
            //create an array to separate the data in the csv

            String csvLine;
            while ((csvLine = bufReader.readLine()) != null) {
                String[] dataArray = csvLine.split("\\|");

                if (dataArray.length == 8) {

                    int vin;
                    try {
                        vin = Integer.parseInt(dataArray[0]);
                    } catch (NumberFormatException e) {
                        System.out.println("invalid number" + dataArray[0]);
                        continue;
                    }

                    int year;
                    try {
                        year = Integer.parseInt(dataArray[1]);
                    } catch (NumberFormatException e) {
                        System.out.println("invalid number" + dataArray[1]);
                        continue;
                    }

                    String make = dataArray[2];
                    String model = dataArray[3];
                    String vehicleType = dataArray[4];
                    String color = dataArray[5];

                    int odometer;
                    try {
                        odometer = Integer.parseInt(dataArray[6]);
                    } catch (NumberFormatException e) {
                        System.out.println("invalid number" + dataArray[6]);
                        continue;
                    }

                    double price;
                    try {
                        price = Double.parseDouble(dataArray[7]);
                    } catch (NumberFormatException e) {
                        System.out.println("invalid number" + dataArray[7]);
                        continue;
                    }
                    Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                    inventory.add(vehicle);
                }
            }bufReader.close();

        return inventory;
    }

}