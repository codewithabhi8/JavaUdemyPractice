package FrameBasedApp;
import java.awt.*;
import java.awt.event.*;

class MyFrames extends Frame implements ActionListener {
    int count=0;
    Label l;
    Button b;

    public MyFrames() {
        super("Counter");
        l=new Label("     "+count);
        b=new Button("Click");
        b.addActionListener(this);
        setLayout(new FlowLayout());
        add(l);
        add(b);
    }

    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("     "+count);
    }
}

public class CounterButton {
    public static void main(String[] args) {
        MyFrames mf = new MyFrames();
        mf.setVisible(true);
        mf.setSize(400, 400);
    }
}
