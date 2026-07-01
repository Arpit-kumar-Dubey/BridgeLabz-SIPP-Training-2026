package scenarioBased;

import java.util.ArrayList;

public class ParkingMain {

    public static void main(String[] args) {

        ArrayList<String> parkingList = new ArrayList<>();

        addVehicle(parkingList, "UP32AB1234");
        addVehicle(parkingList, "MP20CD5678");
        addVehicle(parkingList, "DL05EF9876");
        addVehicle(parkingList, "UP65GH4567");

        System.out.println("\n------ Parked Vehicles ------");
        displayVehicles(parkingList);

        System.out.println("\n------ Search Vehicle ------");
        searchVehicle(parkingList, "MP20CD5678");
        System.out.println("\n------ Vehicle Exit ------");
        removeVehicle(parkingList, "DL05EF9876");

        System.out.println("\n------ Updated Parking ------");
        displayVehicles(parkingList);
    }


    public static void addVehicle(ArrayList<String> parkingList, String vehicleNo) {

        parkingList.add(vehicleNo);
        System.out.println(vehicleNo + " Entered Successfully.");
    }


    public static void removeVehicle(ArrayList<String> parkingList, String vehicleNo) {

        if (parkingList.remove(vehicleNo)) {
            System.out.println(vehicleNo + " Exited Successfully.");
        } else {
            System.out.println("Vehicle Not Found.");
        }
    }

    public static void searchVehicle(ArrayList<String> parkingList, String vehicleNo) {

        if (parkingList.contains(vehicleNo)) {
            System.out.println(vehicleNo + " is Currently Parked.");
        } else {
            System.out.println(vehicleNo + " is Not Parked.");
        }
    }

    public static void displayVehicles(ArrayList<String> parkingList) {

        if (parkingList.isEmpty()) {
            System.out.println("Parking is Empty.");
        } else {

            for (String vehicle : parkingList) {
                System.out.println(vehicle);
            }

            System.out.println("\nTotal Occupied Slots : " + parkingList.size());
        }
    }
}