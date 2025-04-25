package org.example.LLD.TraficLightManagement.state;

import org.example.LLD.TraficLightManagement.TrafficLight;

public class RedLight implements LightState{
    private static final Lights STATE = Lights.RED;
    private int TIME = 60;
    public RedLight(int time){
        this.TIME = time;
    }
    @Override
    public void changeState(TrafficLight trafficLight) {
        try{
        LightState prev = trafficLight.getCurrentState();
        System.out.println(prev.displayState() + " Light");
        Thread.sleep(TIME);
        trafficLight.setCurrentState(trafficLight.getYellowLight());
        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
         }
    }
    @Override
    public void setTime(int time){
        this.TIME = time;
    }
    @Override
    public Lights displayState() {
        return STATE;
    }

    @Override
    public void handleEmergency(TrafficLight trafficLight) {
        System.out.println("Emergency: Changing from RED to GREEN");
        try {
            Thread.sleep(1000);
            trafficLight.setCurrentState(trafficLight.getGreenLight());
        } catch (InterruptedException e) {
            System.out.println("Error in emergency transition to Green Light");
        }
    }
}
