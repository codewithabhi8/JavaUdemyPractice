package FrameBasedApp;
import java.awt.*;
import java.awt.event.*;

class MyFrameScroll extends Frame {
    Scrollbar red, green, blue;
    TextField tf;

    public MyFrameScroll(){
        super("Scrollbar Demo");
        red=new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
        green =new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
        blue=new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
        tf=new TextField(20);
        tf.setBounds(50,50,300,50);
        red.setBounds(50,150,300,30);
        green.setBounds(50,200,300,30);
        blue.setBounds(50,250,300,30);
        setLayout(null);
        add(tf);
        add(red);
        add(green);
        add(blue);
        Handler h = new Handler();
        red.addAdjustmentListener(h);
        green.addAdjustmentListener(h);
        blue.addAdjustmentListener(h);
    }

    class Handler implements AdjustmentListener{
        @Override
        public void adjustmentValueChanged(AdjustmentEvent e) {
            tf.setBackground(new Color(red.getValue(), green.getValue(), blue.getValue()));
        }
    }
}

public class ScrollbarDemo {
    public static void main(String[] args) {
        MyFrameScroll mf = new MyFrameScroll();
        mf.setVisible(true);
        mf.setSize(400, 400);
    }
}

