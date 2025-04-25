package org.example.designPatterns.singleton;

public enum SingletonEnum {
    INSTANCE;
    private final Counter dbConnection;

    SingletonEnum() {
        dbConnection = new Counter();
    }

    public Counter getInstance(){
        return dbConnection;
    }
}
