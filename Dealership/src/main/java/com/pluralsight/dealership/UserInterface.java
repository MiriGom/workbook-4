package com.pluralsight.dealership;

import java.io.IOException;
import java.util.*;

public class UserInterface {
    Scanner scan = new Scanner(System.in);
    private Dealership dealership; //class variable to hold the list of Vehicles
    public void userInterface(){
        display();
    }
    public void display(){
        init();// Initializes Dealership
        boolean isRunning = true;
        while (isRunning) {
            System.out.printf("""
                    ========================================
                    
                                   DEALERSHIP
                    
                    ========================================
                    1) SEARCH BY PRICE
                    2) SEARCH BY MAKE/MODEL
                    3) SEARCH BY YEAR
                    4) SEARCH BY COLOR
                    5) SEARCH BY MILEAGE
                    6) SEARCH VEHICLE TYPE
                    7) SEARCH WHOLE INVENTORY
                    
                    """);
            //added try catch so that it tells you when you entered an invalid input.
            try {
                int userCommand = scan.nextInt();
                scan.nextLine();
                switch (userCommand) {
                    case 1:
                        processGetByPriceRequest();
                        break;
                    case 2:
                        processGetByMakeModelRequest();
                        break;
                    case 3:
                        processGetByYearRequest();
                        break;
                    case 4:
                        processGetByColorRequest();
                        break;
                    case 5:
                        processGetByMileageRequests();
                        break;
                    case 6:
                        processGetByVehicleTypeRequest();
                        break;
                    case 7:
                        processGetAllVehicleRequest();
                        break;
                }
            }catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter a number.");
                scan.nextLine();
            }
        }
    }
    private void init(){


            try {
                dealership = new DealershipFileManager().getDealership();
            } catch (IOException e) {

            }
    }
    public void processGetByPriceRequest() {
        System.out.println("Please enter the min price you are looking for");
        double userMinPrice = scan.nextInt();
        scan.nextLine();
        System.out.println("Please enter your max price you are looking for");
        double userMaxPrice = scan.nextInt();
        scan.nextLine();

        for (Vehicle v : dealership.getVehiclesByPrice(userMinPrice, userMaxPrice))
        System.out.println(v);
    }
    public void processGetByMakeModelRequest(){
        System.out.println("Please enter the Make you are searching for");
        String userMake = scan.nextLine();
        System.out.println("Please enter Model");
        String userModel = scan.nextLine();

        for (Vehicle v : dealership.getVehiclesByMakeModel(userMake, userModel)){
            System.out.println(v);
        }
    }
    public void processGetByYearRequest(){
        System.out.println("Please enter the min year your are searching for");
        int userMinYear = scan.nextInt();
        scan.nextLine();
        System.out.println("Please enter the max year");
        int userMaxYear = scan.nextInt();
        scan.nextLine();

            for (Vehicle v : dealership.getVehiclesByYear(userMinYear, userMaxYear)){
            System.out.println(v);
        }

    }
    public void processGetByColorRequest(){
        System.out.println("Please enter the color you are searching for?");
        String userColor = scan.nextLine();

            for (Vehicle v : dealership.getVehiclesByColor(userColor)) {
                System.out.println(v);
            }
    }
    public void processGetByMileageRequests(){

    }
    public void processGetByVehicleTypeRequest(){

    }
    public void processGetAllVehicleRequest(){

            for (Vehicle vehicle : dealership.getAllVehicles()) {
                System.out.println(vehicle);
            }
    }
    public void processAddVehicleRequest(){

    }
    public void processRemoveVehicleRequest(){

    }
}
