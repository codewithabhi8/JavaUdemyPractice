package SwingDemo;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.io.File;
import java.util.Objects;

class MyFrameTree extends JFrame implements TreeSelectionListener {
    JTree tree;
    JLabel label;
    MyFrameTree() {
        super("Directory");
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("C:");
        File f= new File("C:");
        for(File x: Objects.requireNonNull(f.listFiles())) {
            if(x.isDirectory())
            {
                DefaultMutableTreeNode temp= new DefaultMutableTreeNode(x.getName());
                for(File y: Objects.requireNonNull(x.listFiles())){
                    temp.add(new DefaultMutableTreeNode(x.getName()));
                }
                root.add(temp);
            }
            else
                root.add(new DefaultMutableTreeNode(x.getName()));
        }
        tree=new JTree(root);
        JScrollPane sp = new JScrollPane(tree);
        label = new JLabel("No Files Selected");
        tree.addTreeSelectionListener(this);
        add(sp, BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);
    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        label.setText(e.getPath().toString());
    }
}

public class SwingTree {
    public static void main(String[] args) {
        MyFrameTree mf = new MyFrameTree();
        mf.setVisible(true);
        mf.setSize(500, 400);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
