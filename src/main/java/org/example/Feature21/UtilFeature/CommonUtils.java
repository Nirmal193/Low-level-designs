package org.example.Feature21.UtilFeature;

import java.util.*;
import java.io.Serializable;
import java.util.Map;
import java.util.stream.Collectors;

public class CommonUtils {
    public static String enhancedSwitch1(String day){
        // Enhanced switch statement
        // As we are returning something from the switch so it is an statement not an expression
         return switch (day.toLowerCase()) {
            case "monday", "wednesday" ,"friday" -> "medium trafic day";
            case "tuesday", "thursday" -> "High trafic day";
            case "weekend" -> "low trafic day";
             default -> {
                 System.out.println("Invalid day");
                 yield "Invalid day";
             }
        };
    }
    public static void enhanceSwitch2(String day){
        // Enhanced switch statement
        // As we are not returning anything from the switch so it is an expression not an statement
        switch (day.toLowerCase()){
            case "monday", "wednesday" ,"friday" -> System.out.println("medium trafic day");
            case "tuesday" ,"thursday" -> System.out.println("High trafic day");
            case "weekend" -> System.out.println("low trafic day");
            default -> System.out.println("Invalid day");
        }
    }
    public static void stringFnctionality(){
        String name  = "  John Doe \u2003";
        name  = name.strip(); // removes all leading and trailing white spaces
        String multiLineString = "my\nmy\nname\nis\nnirmal";
        multiLineString.lines().forEach(System.out::println);
        System.out.println("ha".repeat(3));
        String number = "46".transform(s->s + " is a number");
        System.out.println(number);
    }
    public static void additionalCOllections(){
        Map<String, ? extends Serializable> person = Map.of(
                "name", "John",
                "age", 25,
                "address", "123 Main St",
                "phone", "123-456-7890"
        );
        Serializable name = person.get("name");
        int age = (int)person.get("age");
        System.out.println(name);
        System.out.println("age:- " + age+2);
        System.out.println(person);

        Map<String, ? extends Serializable> person2 = Map.copyOf(person);
        System.out.println("person2 map");
        System.out.println(person2);
    }
    //Collections.teeing added in java 12 and this means the stream will be split into two streams and then the results of both streams will be combined
    // this is useful when you want to perform two different operations on the same stream and then combine the results
    //The operation is performed in parellel not like regular streams
    public static void advancedStream(){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        String collect = numbers.stream().collect(Collectors.teeing(Collectors.summarizingInt(i -> i)
                , Collectors.averagingInt(i -> i),
                (sum, avg) -> "sum: " + sum + " avg: " + avg
        ));
        System.out.println(collect);
    }
    public static void objectTypes(Object obj){
        if(obj instanceof String){
            System.out.println("String");
            System.out.println(((String) obj).toUpperCase());
        }else if(obj instanceof Integer) {
            System.out.println("Integer");
            System.out.println(obj);
        }
    }
    public static void main(String[] args) {
        objectTypes(12);
    }
}
