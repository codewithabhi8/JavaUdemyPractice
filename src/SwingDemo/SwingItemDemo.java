package SwingDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

class MyFrameSwingItem extends JFrame implements ActionListener {
    JCheckBox c1,c2;
    JRadioButton r1,r2;
    JTextField tf;
    MyFrameSwingItem() {
        super("Bold Italic Mnemonic");
        tf=new JTextField("Demo Text", 20);
        tf.setBounds(10,20,100,80);
        c1=new JCheckBox("Bold");
        c1.setMnemonic(KeyEvent.VK_B);
        c2=new JCheckBox("Italics");
        c2.setMnemonic(KeyEvent.VK_I);
        r1=new JRadioButton("lower");
        r1.setMnemonic(KeyEvent.VK_U);
        r2=new JRadioButton("UPPER");
        r2.setMnemonic(KeyEvent.VK_L);
        ButtonGroup bg= new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        c1.addActionListener(this);
        c2.addActionListener(this);
        r1.addActionListener(this);
        r2.addActionListener(this);
        r1.setActionCommand("lower");
        r2.setActionCommand("UPPER");
        setLayout(new FlowLayout());
        add(tf);
        add(c1);
        add(c2);
        add(r1);
        add(r2);

    }
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case "lower": tf.setText(tf.getText().toLowerCase());
            break;
            case "UPPER": tf.setText(tf.getText().toUpperCase());
            break;
        }

        int b=0, i=0;
        if(c1.isSelected())b= Font.BOLD;
        if(c2.isSelected())i=Font.ITALIC;

        Font f = new Font("Times New Roman", b|i,15);
        tf.setFont(f);
    }
}

public class SwingItemDemo {
    public static void main(String[] args) {
        MyFrameSwingItem mf = new MyFrameSwingItem();
        mf.setVisible(true);
        mf.setSize(500, 400);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
