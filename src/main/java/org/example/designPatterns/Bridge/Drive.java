package org.example.designPatterns.Bridge;

public class Drive {
    public static void main(String[] args) {
        Render render = new QVRRender();
        Render render1 = new SVSRender();
        Shape shape = new Circle(render,5);
        shape.draw("Circle");
    }
}
