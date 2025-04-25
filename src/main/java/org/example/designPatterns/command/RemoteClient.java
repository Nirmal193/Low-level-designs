package org.example.designPatterns.command;

import org.example.designPatterns.command.appliances.Light;
import org.example.designPatterns.command.invoker.RemoteController;

public class RemoteClient {
    public static void main(String[] args) {
        Light light1 =  new Light("Light1");
        RemoteController rc = new RemoteController();
        rc.setCommand("LightOn", new LightOnCommand(light1));
        rc.setCommand("IncreaseBrightness", new IncreaseBrightness(light1));
        rc.pressButton("LightOn", 0);
        rc.pressButton("IncreaseBrightness", 5);
        rc.pressButton("IncreaseBrightness", 10);
        rc.pressUndo();
    }
}
