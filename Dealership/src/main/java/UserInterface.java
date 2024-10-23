import com.pluralsight.dealership.DealershipFileManager;
import com.pluralsight.dealership.Vehicle;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class UserInterface {
    Scanner scan = new Scanner(System.in);
    private List<Vehicle> inventory; //class variable to hold the list of Vehicles
    public void userInterface(){
        display();
    }
    public void display(){
        init();// Initializes Inventory
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
        }


    }
    private void init(){
        DealershipFileManager manageFile = new DealershipFileManager();
        inventory = DealershipFileManager.getDealership();

    }
    public void processGetByPriceRequest() {
        for (Vehicle vehicle : inventory) {
            System.out.println((vehicle.getPrice()));
        }
    }
    public void processGetByMakeModelRequest(){

    }
    public void processGetByYearRequest(){

    }
    public void processGetByColorRequest(){

    }
    public void processGetByMileageRequests(){

    }
    public void processGetByVehicleTypeRequest(){

    }
    public void processGetAllVehicleRequest(){

    }
    public void processAddVehicleRequest(){

    }
    public void processRemoveVehicleRequest(){

    }
}
