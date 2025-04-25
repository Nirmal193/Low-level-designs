package org.example.designPatterns.singleton;

public class SingletonDriver {
    public static void main(String[] args) {
        StaticBlockSingleton instance = StaticBlockSingleton.getInstance();
        System.out.println(instance);
    }
    public static void singletonEnum(){
        SingletonEnum instance = SingletonEnum.INSTANCE;
        Counter dbConnection1 = instance.getInstance();
        Counter dbConnection2 = instance.getInstance();
        Counter dbConnection3 = new Counter();
        dbConnection3.doSomething();
        dbConnection1.doSomething();
        dbConnection2.doSomething();
        System.out.println(dbConnection1);
        System.out.println(dbConnection2);
        System.out.println(dbConnection3);
    }
}
