package org.example.designPatterns.Bridge;

public class Circle extends Shape{
    int redius;
    public Circle(Render render, int redius) {
        super(render);
        this.redius = redius;
    }
    @Override
    public void draw(String content) {
        render.render(content);
    }
}
