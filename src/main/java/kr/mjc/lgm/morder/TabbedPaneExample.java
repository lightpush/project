package kr.mjc.lgm.morder;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPaneExample extends JFrame {

    public TabbedPaneExample() {
        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel("This is the content of tab 1");
        panel1.add(label1);
        JPanel panel2 = new JPanel();
        JLabel label2 = new JLabel("This is the content of tab 2");
        panel2.add(label2);
        tabbedPane.addTab("Tab 1", panel1);
        tabbedPane.addTab("Tab 2", panel2);
        add(tabbedPane);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPaneExample();
    }
}
