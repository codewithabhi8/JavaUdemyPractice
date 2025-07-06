package FrameBasedApp;
import java.awt.*;

public class FirstApp {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setLayout(new FlowLayout());
        Button b = new Button("Click me");
        Label l = new Label("Name ");
        TextField tf = new TextField(20);
        f.add(b);
        f.add(tf);
        f.add(l);
        f.setSize(300, 300);
        f.setVisible(true);
    }
}
