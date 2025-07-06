package FrameBasedApp;
import java.awt.*;
import java.awt.event.*;

class MyFrameTextArea extends Frame  {
    Label l;
    TextArea ta;
    TextField tf;
    Button b;

    public MyFrameTextArea(){
        super("Text Area Demo");
        l=new Label("No text is entered yet");
        tf=new TextField(20);
        ta=new TextArea(10,30);
        b=new Button("Click");
        tf.setEchoChar('*');
        setLayout(new FlowLayout());
        add(l);
        add(ta);
        add(tf);
        add(b);
        Handler h = new Handler();
        b.addActionListener(h);
    }

    class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           l.setText(ta.getSelectedText());
        }
    }
}

public class TextAreaDemo {
    public static void main(String[] args) {
        MyFrameTextArea mf = new MyFrameTextArea();
        mf.setVisible(true);
        mf.setSize(400, 400);
    }
}

