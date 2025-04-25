package org.example.LLD.parkingLot.vehicles;

public abstract class Vehicle {
    private String vehicleNumber;
    private String color;
    private VehicleType vehicleType;

    public Vehicle(String vehicleNumber, String color, VehicleType vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.color = color;
        this.vehicleType = vehicleType;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
