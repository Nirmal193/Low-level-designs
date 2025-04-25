package org.example.designPatterns.factory;

// This is a marker interface for the Product in the Factory Design Pattern.
public sealed interface Product permits P1,P2,P3 {
    void function();
}
