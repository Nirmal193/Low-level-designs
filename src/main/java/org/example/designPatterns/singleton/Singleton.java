package org.example.designPatterns.singleton;

public class Singleton {
    private static Singleton lazyInstance;
    private static volatile  Singleton doubleCheckedInstance;
    private static final Singleton eagerInstance = new Singleton();
    private static class SingletonHelper{
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getBillPlughInstance(){
        return SingletonHelper.INSTANCE;
    }
    private Singleton(){}
    public static Singleton getLazyInstance(){
        if(lazyInstance == null)
            lazyInstance = new Singleton();
        return lazyInstance;
    }
    private static Singleton getDoubleCheckedInstance(){
        if(doubleCheckedInstance == null){
            synchronized (Singleton.class){
                if(doubleCheckedInstance == null){
                    doubleCheckedInstance = new Singleton();
                }
            }
        }
        return doubleCheckedInstance;
    }
    private static Singleton getEagerInstance(){
        return eagerInstance;
    }
    public static void main(String[] args) {

    }
}
