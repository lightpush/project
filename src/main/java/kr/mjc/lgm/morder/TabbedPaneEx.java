package kr.mjc.lgm.morder;

import javax.swing.*;
import java.awt.*;

public class TabbedPaneEx extends JFrame {
    public TabbedPaneEx() {
        setTitle("명지 주문 시스템");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane pane = new JTabbedPane(JTabbedPane.LEFT);
        JTabbedPane money = new JTabbedPane(JTabbedPane.LEFT);
        JPanel popular = new JPanel(new GridLayout(3,3,5,5));
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

        JPanel order = new JPanel();
        order.add(new JButton("주문내역"));

        JPanel bill = new JPanel();
        bill.add(new JButton("주문내역"));

        JPanel buy = new JPanel();
        buy.add(new JButton("주문내역"));


        pane.addTab("인기 메뉴", popular);
        pane.addTab("면 류", myon);
        pane.addTab("밥 류",rice);
        money.addTab("주문내역", order);
        money.addTab("계산서", bill);
        money.add("장바구니", buy);
        add(pane, BorderLayout.WEST);
        add(money, BorderLayout.SOUTH);



        setSize(1000, 600);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPaneEx();
    }
}