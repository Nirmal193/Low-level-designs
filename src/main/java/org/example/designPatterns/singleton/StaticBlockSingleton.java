package org.example.designPatterns.singleton;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;
    static {
        try{
            instance = new StaticBlockSingleton();
            throw  new IllegalStateException();
        }catch (Exception e){
            System.out.println("Exception occurred while creating instance");
        }
    }
    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}
