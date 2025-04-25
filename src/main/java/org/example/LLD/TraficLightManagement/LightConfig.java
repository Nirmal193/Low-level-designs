package org.example.LLD.TraficLightManagement;

public class LightConfig {
    private int redDuration;
    private int greenDuration;
    private int yellowDuration;

    public LightConfig(int redDuration, int greenDuration, int yellowDuration) {
        this.redDuration = redDuration;
        this.greenDuration = greenDuration;
        this.yellowDuration = yellowDuration;
    }
    public int getRedDuration() {
        return redDuration;
    }
    public void setRedDuration(int redDuration) {
        this.redDuration = redDuration;
    }
    public int getGreenDuration() {
        return greenDuration;
    }
    public void setGreenDuration(int greenDuration) {
        this.greenDuration = greenDuration;
    }
    public int getYellowDuration() {
        return yellowDuration;
    }
    public void setYellowDuration(int yellowDuration) {
        this.yellowDuration = yellowDuration;
    }
}
