package org.example.designPatterns.Bridge;

public abstract class Shape {
    protected Render render;

    public Shape(Render render){
        this.render = render;
    }
    public abstract void draw(String content);
}
