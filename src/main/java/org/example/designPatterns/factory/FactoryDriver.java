package org.example.designPatterns.factory;

public class FactoryDriver {
    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();
        Product p1 = factory.createProduct("P1");
        p1.function();
    }
}
