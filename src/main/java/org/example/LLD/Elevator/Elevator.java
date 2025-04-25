package org.example.LLD.Elevator;

import java.util.*;

public class Elevator {
    private int id;
    private int currentFloor;
    private State state;
    private Direction direction;
    private final double weightLimit;
    private double currentLoad;
    Stack<Request> requestList;
    public Elevator(int id,double weightLimit){
        this.id = id;
        this.currentFloor = 0;
        this.state = State.IDLE;
        this.direction = Direction.NONE;
        this.weightLimit = weightLimit;
        this.currentLoad = 0;
        requestList = new Stack<>();
    }
    public int getId() {
        return id;
    }
    public double getWeightLimit() {
        return weightLimit;
    }
    public double getCurrentLoad() {
        return currentLoad;
    }
    public void setCurrentLoad(double currentLoad) {
        this.currentLoad = currentLoad;
    }
    public void addWeight(double weight){
        this.currentLoad += weight;
    }
    public void removeWeight(double weight){
        this.currentLoad -= weight;
    }
    public boolean isOverloaded(){
        return this.currentLoad > this.weightLimit;
    }
    public int getCurrentFloor() {
        return currentFloor;
    }
    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }
    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }
    public Direction getDirection() {
        return direction;
    }
    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    public void requestElevater(Request request){
        if(request.getSourceFloor() == this.currentFloor){
            System.out.println("Elevator " + this.id + "is already at th source floor  " + this.currentFloor);
            requestList.add(request);
        }else{
            System.out.println("Elevator " + this.id + " is moving to the source floor " + request.getSourceFloor());
            requestList.add(request);
        }
    }
    public void moveToFloor(Request request){

    }
}
