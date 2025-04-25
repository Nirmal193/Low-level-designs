package org.example.designPatterns.Bridge;

public class SVSRender implements Render {
    @Override
    public void render(String content) {
        System.out.println("Rendering content in SVS format: " + content);
    }
}
