package org.example.designPatterns.command.appliances;

public class Light {
    private String name;
    private boolean isOn;
    private int brightness;

    public Light(String name) {
        this.name = name;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        this.brightness = 100; // Default brightness when turned on
        System.out.println(name + " is turned on.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(name + " is turned off.");
    }

    public boolean isOn() {
        return isOn;
    }

    public void setBrightness(int brightness) {
        if (isOn) {
            this.brightness = brightness;
            System.out.println(name + " brightness set to " + brightness + ".");
        } else {
            System.out.println(name + " is off. Cannot set brightness.");
        }
    }
    public int getBrightness() {
        return brightness;
    }
    public String getName() {
        return name;
    }
}
