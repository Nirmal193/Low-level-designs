package org.example.designPatterns.prototype;

public class PrototypeDriver {
    public static void main(String[] args) {
        PersonObj personObj = new PersonObj("John Doe", 30);
        PersonObj personProtoType = personObj.clone();
    }
}
