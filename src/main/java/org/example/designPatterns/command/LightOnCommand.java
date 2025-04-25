package org.example.designPatterns.command;

import org.example.designPatterns.command.appliances.Light;

public class LightOnCommand implements Command{
    private final Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute(int parameter) {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
