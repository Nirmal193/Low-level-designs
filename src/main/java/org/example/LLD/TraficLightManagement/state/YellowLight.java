package org.example.LLD.TraficLightManagement.state;

import org.example.LLD.TraficLightManagement.TrafficLight;

public class YellowLight implements LightState{
    private int time;
    private static final Lights STATE = Lights.YELLOW;
    public YellowLight(int time){
        this.time = time;
    }
    @Override
    public void changeState(TrafficLight trafficLight) {
        try{
            LightState prev = trafficLight.getCurrentState();
            System.out.println(prev.displayState() + " Light");
            Thread.sleep(time);
            trafficLight.setCurrentState(trafficLight.getGreenLight());
        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public Lights displayState() {
        return STATE;
    }

    @Override
    public void handleEmergency(TrafficLight trafficLight) {
        System.out.println("Emergency: Changing from YELLOW to GREEN");
        trafficLight.setCurrentState(trafficLight.getGreenLight());
    }

    @Override
    public void setTime(int time) {
        this.time = time;
    }
}
