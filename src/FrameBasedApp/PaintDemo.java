package FrameBasedApp;
import java.awt.*;
import java.awt.event.*;

class MyFramePaint extends Frame {
    int x=0,y=0;
    MyFramePaint() {
        super("Paint demo");
//        addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent me){
//                x=me.getX();
//                y=me.getY();
//                repaint();
//            }
//        });
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent me){
                x=me.getX();
                y=me.getY();
                repaint();
            }
        });
    }
    public void paint(Graphics g){
        g.setColor(Color.RED);
//        g.fillOval(x,y,50,50);
        g.setFont(new Font("Times New Roman", Font.BOLD, 30));
        g.drawString("Abhi",x,y);
    }
}

public class PaintDemo {
    public static void main(String[] args) {
        MyFramePaint mf = new MyFramePaint();
        mf.setVisible(true);
        mf.setSize(400, 400);
    }
}
