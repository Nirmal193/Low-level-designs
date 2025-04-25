package org.example.designPatterns.command.invoker;

import org.example.designPatterns.command.Command;

import java.util.HashMap;
import java.util.Map;

public class RemoteController {
    private final Map<String,Command> commandMap;
    private Command lastCommand;
    public RemoteController(){
        commandMap = new HashMap<>();
    }
    public void setCommand(String name, Command command){
        commandMap.put(name,command);
    }
    public void pressButton(String name, int parameter){
        Command command = commandMap.get(name);
        if(command != null){
            command.execute(parameter);
            lastCommand = command;
        }else{
            System.out.println("Command not found: " + name);
        }
    }
    public void pressUndo(){
        if(lastCommand != null){
            lastCommand.undo();
        }else{
            System.out.println("No command to undo.");
        }
    }
}
