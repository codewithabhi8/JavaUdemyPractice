package FrameBasedApp;
import java.awt.*;
import java.awt.event.*;

class MyFrameAnimation extends Frame implements Runnable{
    int x,y,tx,ty;
    MyFrameAnimation() {
        x=100;
        y=100;
        tx=ty=1;
        Thread th =new Thread(this);
        th.start();
    }
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillOval(x,y,50,50);
        g.setFont(new Font("Times New Roman", Font.BOLD, 30));
    }
    public void run() {
        while(true){
            x+=tx;
            y+=ty;
            if(x<0 || x>450)
                tx=tx*-1;
            if(y<25 || y>350)
                ty=ty*-1;
            repaint();
            try{Thread.sleep(5);}catch(Exception e){}
        }
    }
}

public class AnimationDemo {
    public static void main(String[] args) {
        MyFrameAnimation mf = new MyFrameAnimation();
        mf.setVisible(true);
        mf.setSize(500, 400);
    }
}
