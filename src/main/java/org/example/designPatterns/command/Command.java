package org.example.designPatterns.command;

public interface Command {
    void execute(int parameter);
    void undo();
}
