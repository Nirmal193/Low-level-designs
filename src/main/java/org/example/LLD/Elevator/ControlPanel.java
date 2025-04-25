package org.example.LLD.Elevator;

import java.util.Collections;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ControlPanel {
    private int floorNumber;
    private final List<Elevator> elevatorList;

    public ControlPanel(int floorNumber){
        this.floorNumber = floorNumber;
        elevatorList = Collections.synchronizedList(new ArrayList<>());
    }
    public void addElevator(Elevator elevator){
        elevatorList.add(elevator);
    }
    public void removeElevator(Elevator elevator){
        elevatorList.remove(elevator);
    }
    public Elevator requestElevator(Request request){
        if(elevatorList.isEmpty()){
            System.out.println("No elevator available");
        }
        synchronized (elevatorList){
            Optional<Elevator> requestedElevator = elevatorList.stream().filter(x -> x.getState() == State.IDLE || x.getDirection() == request.getDirection())
                    .distinct().filter(x -> x.getCurrentLoad() + request.getWeight() <= x.getWeightLimit())
                    .min(Comparator.comparingInt(x -> Math.abs(x.getCurrentFloor() - request.getSourceFloor())));
            if(requestedElevator.isPresent()){
                return requestedElevator.get();
            }else{
                System.out.println("No elevator available to serve the request");
                return null;
            }
        }
    }
    public List<Elevator> getElevatorList() {
        return elevatorList;
    }
}
