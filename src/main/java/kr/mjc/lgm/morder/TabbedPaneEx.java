package kr.mjc.lgm.morder;

import javax.swing.*;
import java.awt.*;

public class TabbedPaneEx extends JFrame {
    public TabbedPaneEx() {
        setTitle("명지 주문 시스템");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        JTabbedPane pane = new JTabbedPane(JTabbedPane.LEFT);
        JPanel popular = new JPanel();
        popular.add(new JButton("메뉴 1"));
        popular.add(new JButton("메뉴 2"));
        popular.add(new JButton("메뉴 3"));
        popular.add(new JButton("메뉴 4"));
        popular.add(new JButton("메뉴 5"));
        popular.add(new JButton("메뉴 6"));
        popular.add(new JButton("메뉴 7"));
        popular.add(new JButton("메뉴 8"));
        popular.add(new JButton("메뉴 9"));

        JPanel myon = new JPanel();
        myon.add(new JButton("메뉴 1"));
        myon.add(new JButton("메뉴 2"));
        myon.add(new JButton("메뉴 3"));
        myon.add(new JButton("메뉴 4"));
        myon.add(new JButton("메뉴 5"));
        myon.add(new JButton("메뉴 6"));

        JPanel rice = new JPanel();
        rice.add(new JButton("메뉴 1"));
        rice.add(new JButton("메뉴 2"));
        rice.add(new JButton("메뉴 3"));

        pane.addTab("인기 메뉴", popular);
        pane.addTab("면 류", myon);
        pane.addTab("밥 류",rice);
        c.add(pane, BorderLayout.WEST);



        setSize(1000, 600);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPaneEx();
    }
}