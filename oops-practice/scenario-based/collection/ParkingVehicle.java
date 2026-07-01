package scenarioBased;

public class ParkingVehicle {

    String registrationNumber;

    public ParkingVehicle(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Vehicle Number : " + registrationNumber;
    }
}