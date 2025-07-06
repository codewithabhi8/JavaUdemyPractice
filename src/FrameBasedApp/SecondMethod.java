package FrameBasedApp;
import java.awt.*;

class MyFrame extends Frame {
    Label l;
    TextField tf;
    Button b;

    public MyFrame() {
        super("My App");
        setLayout(new FlowLayout());
        l = new Label("Name ");
        tf = new TextField(20);
        b = new Button("Click me");
        add(l);
        add(tf);
        add(b);
    }
}

public class SecondMethod {
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
        mf.setSize(300, 300);
        mf.setVisible(true);
    }

}
