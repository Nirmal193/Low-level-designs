package org.example.designPatterns.command;

import org.example.designPatterns.command.appliances.Light;

public class IncreaseBrightness implements Command{
    private final Light light;
    private int previousBrightness;
    public IncreaseBrightness(Light light) {
        this.light = light;
        int previousBrightness = light.getBrightness();
    }
    @Override
    public void execute(int parameter) {
        previousBrightness = light.getBrightness();
        light.setBrightness(parameter);
    }

    @Override
    public void undo() {
        light.setBrightness(previousBrightness);
    }
}
