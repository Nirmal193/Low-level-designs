package org.example.LLD.TraficLightManagement.state;

public enum Lights {
    RED(1),
    GREEN(2),
    YELLOW(3);

    private int value;

    Lights(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Lights fromValue(int value) {
        for (Lights light : Lights.values()) {
            if (light.getValue() == value) {
                return light;
            }
        }
        throw new IllegalArgumentException("Invalid value: " + value);
    }
}
