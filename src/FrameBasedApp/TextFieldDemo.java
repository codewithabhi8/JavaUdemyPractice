package FrameBasedApp;
import java.awt.*;
import java.awt.event.*;

class MyFrameText extends Frame  {
    Label l1,l2;
    TextField tf;
    public MyFrameText(){
        super("Text Field Demo");
        l1=new Label("No text is entered yet");
        l2=new Label("Enter key is not yet hit");
        tf=new TextField(50);
        tf.setEchoChar('*');
        Handler h =new Handler();
        tf.addTextListener(h);
        tf.addActionListener(h);
        setLayout(new FlowLayout());
        add(l1);
        add(tf);
        add(l2);
    }

    class Handler implements TextListener, ActionListener{
        @Override
        public void textValueChanged(TextEvent e) {
            l1.setText(tf.getText());
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            l2.setText(tf.getText());
        }

    }
}

public class TextFieldDemo {
    public static void main(String[] args) {
        MyFrameText mf = new MyFrameText();
        mf.setVisible(true);
        mf.setSize(400, 400);
    }
}
