package org.example.LLD.Elevator;

public class Request {
    private int sourceFloor;
    private int destinationFloor;
    private Direction direction;
    private double weight;

    public Request(int sourceFloor,int destinationFloor,double weight){
        this.sourceFloor = sourceFloor;
        this.destinationFloor = destinationFloor;
        this.direction = sourceFloor < destinationFloor ? Direction.UP : Direction.DOWN;
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public int getSourceFloor() {
        return sourceFloor;
    }
    public void setSourceFloor(int sourceFloor) {
        this.sourceFloor = sourceFloor;
    }
    public int getDestinationFloor() {
        return destinationFloor;
    }
    public void setDestinationFloor(int destinationFloor) {
        this.destinationFloor = destinationFloor;
    }
    public Direction getDirection() {
        return direction;
    }
}
