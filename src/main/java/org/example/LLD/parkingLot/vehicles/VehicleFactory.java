package org.example.LLD.parkingLot.vehicles;

public class VehicleFactory {
    public static Vehicle getVehicle(VehicleType vehicleType, String plateNumber){
        switch (vehicleType){
            case CAR:
                return new Car(plateNumber, "red", vehicleType);
            case MOTORCYCLE:
                return new Bike(plateNumber, "blue", vehicleType);
            case TRUCK:
                return new Truck(plateNumber, "green", vehicleType);
            default:
                throw new IllegalArgumentException("Invalid vehicle type");
        }
    }
}
