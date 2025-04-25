package org.example.test_facility;

public class Test_class_01 {
    private static int instanceCount;
    public static int instance;
    static{
        System.out.println("This class is loaded to JVM");
    }
    public static void counter(){
        instanceCount++;
        System.out.println(instanceCount);
    }
    public static void someFucntionality(){
        System.out.println("This is some functionality printed from static function");
    }
}

