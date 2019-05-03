package gof.delegate.entity;

public class Painter {
    Graphics graphics;

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public void draw() {
        graphics.draw();
    }
}
