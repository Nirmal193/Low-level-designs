package org.example.designPatterns.prototype;

public sealed interface Prototype<T> permits PersonObj {
    T clone();
}
