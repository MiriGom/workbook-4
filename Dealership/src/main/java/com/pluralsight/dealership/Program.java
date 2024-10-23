package com.pluralsight.dealership;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static com.pluralsight.dealership.DealershipFileManager.getDealership;

public class Program {
    static Scanner scan = new Scanner(System.in);
    private static List<Vehicle> inventory;

    public static void main(String[] args){
        System.out.println("Press Enter");
       String enterPressed = scan.nextLine();

       boolean isRunning = false;
       if (enterPressed.isEmpty()) {
           isRunning = true;
       }
       while (isRunning) {
           userInterface();
           break;
       }
    }

}
