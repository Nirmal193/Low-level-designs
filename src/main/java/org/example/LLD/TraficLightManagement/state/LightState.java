package org.example.LLD.TraficLightManagement.state;

import org.example.LLD.TraficLightManagement.TrafficLight;

public interface LightState {
    void changeState(TrafficLight trafficLight);
    Lights displayState();
    void handleEmergency(TrafficLight trafficLight);
    public void setTime(int time);
}
