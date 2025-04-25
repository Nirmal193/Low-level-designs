package org.example.LLD.TraficLightManagement.state;

import org.example.LLD.TraficLightManagement.TrafficLight;

public class GreenLight implements LightState{
    private static final Lights STATE = Lights.GREEN;
    private int TIME = 60;
    public GreenLight(int time){
        this.TIME = time;
    }
    @Override
    public void changeState(TrafficLight trafficLight) {
        try{
            LightState curr = trafficLight.getCurrentState();
            System.out.println(curr.displayState() + " Light");
            Thread.sleep(TIME);
            trafficLight.setCurrentState(trafficLight.getRedLight());
        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
            System.out.println("Error in changing state to Green Light");
        }
    }

    @Override
    public Lights displayState() {
        return STATE;
    }

    @Override
    public void handleEmergency(TrafficLight trafficLight) {
        System.out.println("Already in GREEN state for emergency");

    }

    @Override
    public void setTime(int time) {
        this.TIME  =  time;
    }
}
