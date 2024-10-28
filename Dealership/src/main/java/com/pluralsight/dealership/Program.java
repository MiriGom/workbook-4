package com.pluralsight.dealership;
import com.pluralsight.dealership.UserInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    static Scanner scan = new Scanner(System.in);
    private static List<Vehicle> inventory;

    public static void main(String[] args){
        UserInterface uInterface = new UserInterface();
        System.out.println("Press Enter");
       String enterPressed = scan.nextLine();

       boolean isRunning = true;
       while (isRunning) {
           uInterface.userInterface();
           isRunning = false;
       }
    }

}
