package SwingDemo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrameSwing extends JFrame implements ActionListener {
    JLabel jl;
    JButton jb;
    int count = 0 ;
    MyFrameSwing() {
        super("Swing App");
        jl = new JLabel("Clciked"+ count+" Times");
        jb=new JButton("Click");
        add(jl);
        add(jb);
        setLayout(new FlowLayout());
        jb.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        count++;
        jl.setText(String.valueOf(count));
    }
}

public class SwingComponents {
    public static void main(String[] args) {
        MyFrameSwing mf = new MyFrameSwing();
        mf.setVisible(true);
        mf.setSize(500, 400);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
