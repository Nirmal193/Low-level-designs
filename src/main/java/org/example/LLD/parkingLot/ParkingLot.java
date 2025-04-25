package org.example.LLD.parkingLot;

import org.example.LLD.parkingLot.vehicles.Vehicle;
import org.example.LLD.parkingLot.vehicles.VehicleType;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ParkingLot {
    private final ConcurrentHashMap<VehicleType, LinkedList<ParkingSpot>> parkingSpotMap;
    private AtomicInteger emptySpots;
    private final int totalSpots;
    public ParkingLot(int totalSpots){
        this.totalSpots = totalSpots;
        this.emptySpots = new AtomicInteger(totalSpots);
        this.parkingSpotMap = new ConcurrentHashMap<>();
        for(VehicleType vehicleType : VehicleType.values()){
            LinkedList<ParkingSpot> parkingSPots = new LinkedList<>();
            for(int i=0;i<totalSpots/VehicleType.values().length;i++){
                parkingSPots.add(new ParkingSpot(i, vehicleType));
            }
            parkingSpotMap.put(vehicleType, parkingSPots);
        }
    }
    private boolean isAvailable(VehicleType vehicleType){
        LinkedList<ParkingSpot> parkingSpots = parkingSpotMap.get(vehicleType);
        if(parkingSpots.isEmpty() || parkingSpots.getLast().isAvailable() == false){
            return false;
        }else{
            return true;
        }
    }
    public void addParkingSpot(ParkingSpot parkingSpot){
        LinkedList<ParkingSpot> parkingSpots = parkingSpotMap.get(parkingSpot.getVehicleType());
        parkingSpots.add(parkingSpot);
        emptySpots.incrementAndGet();
    }
    public boolean isFull(){
        return emptySpots.get() == 0;
    }
    public boolean parkVehicle(Vehicle vehicle){
        if(!isAvailable(vehicle.getVehicleType())){
            return false;
        }
        LinkedList<ParkingSpot> parkingSpots = parkingSpotMap.get(vehicle.getVehicleType());
        ParkingSpot reservedSpot = parkingSpots.getLast();
        reservedSpot.parkVehicle(vehicle);
        emptySpots.decrementAndGet();
        parkingSpots.removeLast();
        parkingSpots.addFirst(reservedSpot);
        return true;
    }
}