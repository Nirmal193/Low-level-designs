package org.example.designPatterns.Bridge;

public class QVRRender implements Render{
    @Override
    public void render(String content) {
        System.out.println("Rendering content in QVR format: " + content);
    }
}
