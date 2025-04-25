package org.example.LLD.TraficLightManagement;

import org.example.LLD.TraficLightManagement.state.GreenLight;
import org.example.LLD.TraficLightManagement.state.LightState;
import org.example.LLD.TraficLightManagement.state.RedLight;
import org.example.LLD.TraficLightManagement.state.YellowLight;

public class TrafficLight {
    private LightState redLight;
    private LightState greenLight;
    private LightState yellowLight;
    private LightState currentState;
    private LightConfig config;
    private volatile boolean emergency = false;
    private Thread operatingThread;
    public TrafficLight(LightConfig config) {
        this.config = config;
        this.redLight = new RedLight(config.getRedDuration());
        this.greenLight = new GreenLight(config.getGreenDuration());
        this.yellowLight = new YellowLight(config.getYellowDuration());
        this.currentState = redLight;
    }
    public LightState getCurrentState(){
        return this.currentState;
    }
    public void setCurrentState(LightState state){
        this.currentState = state;
    }
    //todo need to fix the inturruption part causing the code to brake here

    public void run() {
        operatingThread = Thread.currentThread();
        while (true) {
            try {
                if (emergency) {
                    System.out.println("Emergency triggered!");
                    currentState.handleEmergency(this);
                    emergency = false;
                } else {
                    currentState.changeState(this);
                }
            } catch (Exception e) {
                Thread.interrupted();
                continue;
            }
        }
    }
    public LightState getGreenLight(){
        return this.greenLight;
    }
    public LightState getRedLight(){
        return this.redLight;
    }
    public LightState getYellowLight(){
        return this.yellowLight;
    }
    public void handleEmergency(){
        emergency = true;
        if (operatingThread != null) {
            operatingThread.interrupt();
        }
    }
}
