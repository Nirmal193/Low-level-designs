package org.example.designPatterns.singleton;

public class Counter {
    private static int instanceCount = 0;
    private final int id;

    public Counter() {
        instanceCount++;
        this.id = instanceCount;
        System.out.println("Created Counter #" + id);
        System.out.println("Total instances: " + instanceCount);
    }

    public void doSomething() {
        System.out.println("Counter #" + id + " doing work");
    }
}
