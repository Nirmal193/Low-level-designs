package org.example.LLD.TraficLightManagement;

public class LightDriver {
    public static void main(String[] args) {
        // Create a TrafficLight instance
        LightConfig config = new LightConfig(2000, 3000, 1000);
        TrafficLight trafficLight = new TrafficLight(config);
        Thread trafficLightThread = new Thread(() -> trafficLight.run());
        trafficLightThread.start();
        try {
            Thread.sleep(5000);
            trafficLight.handleEmergency();
        } catch (InterruptedException e) {
            System.out.println("Error in main thread");
        }
    }
}
