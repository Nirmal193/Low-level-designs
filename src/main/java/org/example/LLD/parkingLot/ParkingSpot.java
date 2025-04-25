package org.example.LLD.parkingLot;

import org.example.LLD.parkingLot.vehicles.Vehicle;
import org.example.LLD.parkingLot.vehicles.VehicleType;

public class ParkingSpot {
    private int spotNumber;
    private boolean isAvailable;
    private Vehicle vehicle;
    private VehicleType vehicleType;
    public ParkingSpot(int spotNumber, VehicleType vehicleType) {
        this.spotNumber = spotNumber;
        this.isAvailable = true;
        this.vehicleType = vehicleType;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }
    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isAvailable = false;
    }
    public void removeVehicle() {
        this.vehicle = null;
        this.isAvailable = true;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
}
