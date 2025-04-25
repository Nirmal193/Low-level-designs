package org.example.designPatterns.command.appliances;

public class TV {
    private String name;
    private boolean isOn;
    private int volume;

    public TV(String name) {
        this.name = name;
        this.isOn = false;
        this.volume = 50; // Default volume when turned on
    }

    public void turnOn() {
        isOn = true;
        System.out.println(name + " is turned on.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(name + " is turned off.");
    }

    public boolean isOn() {
        return isOn;
    }

    public void setVolume(int volume) {
        if (isOn) {
            this.volume = volume;
            System.out.println(name + " volume set to " + volume + ".");
        } else {
            System.out.println(name + " is off. Cannot set volume.");
        }
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }
}
