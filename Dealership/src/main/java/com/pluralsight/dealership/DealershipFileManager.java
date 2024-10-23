package com.pluralsight.dealership;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DealershipFileManager {

    public static void getDealership() {
        //reference the List from another class
        List<Vehicle> inventory = new ArrayList<>();
        // saving path into string variable so the fileWriter can read it as a string
        String filePath = "C:\\pluralsight\\workbook-4\\Dealership\\inventory.csv";
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufReader = new BufferedReader(fileReader)) {
            //create an array to separate the data in the csv

            String line;
            while ((line = bufReader.readLine()) != null) {
                String [] dataArray = line.split("\\|");
                if (dataArray.length < 4) {
                    String name = dataArray[0];
                    String address = dataArray[1];
                    String phone = dataArray[2];

                    Dealership dealership = new Dealership(name, address, phone);

                } else if (dataArray.length < 9) {

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
            } System.out.println(inventory);

        } catch (IOException e) {
            e.printStackTrace();//handle exceptions ( e.g., file not found)
        }

    }
}
