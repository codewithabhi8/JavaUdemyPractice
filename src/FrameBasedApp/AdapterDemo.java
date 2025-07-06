package FrameBasedApp;
import java.awt.*;
import java.awt.event.*;

class MyFrameAdapter extends Frame{
    public MyFrameAdapter(){
        super("Adapter Class Demo");
        addWindowListener(new Handler());
    }

    class Handler extends WindowAdapter{
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    }

}

public class AdapterDemo {
    public static void main(String[] args) {
        MyFrameMenu mf = new MyFrameMenu();
        mf.setVisible(true);
        mf.setSize(400, 400);
    }

}
