package FrameBasedApp;
import java.awt.*;
import java.awt.event.*;

class MyFrameMenu extends Frame{
    Menu file,sub;
    MenuItem open, save, close, closeall;
    CheckboxMenuItem auto;
    TextField tf;
    MyFrameMenu() {
        super("Menu Demo");
        open = new MenuItem("Open");
        save = new MenuItem("save");
        close = new MenuItem("close");
        closeall = new MenuItem("closeall");
        auto=new CheckboxMenuItem("Auto Save");
        file=new Menu("File");
        sub= new Menu("sub");
        file.add(open);
        file.add(save);
        file.add(sub);
        file.add(auto);
        sub.add(close);
        sub.add(closeall);

        MenuBar mb = new MenuBar();
        mb.add(file);
        setMenuBar(mb);
        tf=new TextField(20);
        setLayout(new FlowLayout());
        add(tf);

        open.addActionListener((ActionEvent ae)->tf.setText("Open"));
        save.addActionListener((ActionEvent ae)->tf.setText("Save"));
        close.addActionListener((ActionEvent ae)->tf.setText("Close"));
        closeall.addActionListener((ActionEvent ae)->tf.setText("CloseAll"));
        auto.addItemListener((ItemEvent ie)-> {
            if(auto.getState())
                tf.setText("Auto on");
            else
                tf.setText("Auto off");
        });
    }
}

public class MenuDemo {
    public static void main(String[] args) {
        MyFrameMenu mf = new MyFrameMenu();
        mf.setVisible(true);
        mf.setSize(400, 400);
    }
}
