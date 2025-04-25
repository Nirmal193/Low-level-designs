package org.example.designPatterns.factory;

public class ProductFactory {
    public Product createProduct(String type){
        switch (type) {
            case "P1":
                return new P1();
            case "P2":
                return new P2();
            case "P3":
                return new P3();
            default:
                throw new IllegalArgumentException("Unknown product type: " + type);
        }
    }
}
