package kr.mjc.lgm.morder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class TabbedPaneEx extends JFrame implements ActionListener {
   private JTabbedPane pane = new JTabbedPane(JTabbedPane.LEFT);
    private JPanel popular = new JPanel();
    private JPanel[][] p;
    private JButton[][] plus, minus, basket;
    private JLabel[][] l;
    public TabbedPaneEx() {
        setTitle("명지 주문 시스템");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //버튼 개수와 그리드 레이아웃 크기 설정
        int numCols = 3;
        int numRows = 3;
        popular.setLayout(new GridLayout(numRows, numCols, 5, 5));


        //버튼 배열 생성
        p = new JPanel[numRows][numCols];
        l = new JLabel[numRows][numCols];
        plus = new JButton[numRows][numCols];
        minus = new JButton[numRows][numCols];
        basket = new JButton[numRows][numCols];

        //가격
        String[] price = {"10000원","9000원","8000원","10000원","9000원","8000원", "10000원","9000원","8000원"};

        for(int i=0; i<numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                p[i][j] = new JPanel();
                l[i][j] = new JLabel(price[(i*numCols)+j]);
                plus[i][j] = new JButton("+");
                minus[i][j] = new JButton("-");
                basket[i][j] = new JButton("장바구니");
                plus[i][j].addActionListener(this);
                minus[i][j].addActionListener(this);
                basket[i][j].addActionListener(this);
                popular.add(p[i][j]);
                p[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                p[i][j].setLayout(new FlowLayout(FlowLayout.CENTER));
                p[i][j].add(plus[i][j]);
                p[i][j].add(l[i][j]);
                p[i][j].add(minus[i][j]);
                p[i][j].add(basket[i][j]);
            }
        }
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
        pane.addTab("주문내역", order);
        pane.addTab("계산서", bill);
        pane.add("장바구니", buy);
        add(pane, BorderLayout.WEST);




        setSize(1000, 600);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == plus) {
            System.out.println("Button 1 clicked");
        } else if (e.getSource() == minus) {
            System.out.println("Button 2 clicked");
        } else if (e.getSource() == basket) {
            System.out.println("Button 3 clicked");
        }
    }
    public static void main(String[] args) {
        new TabbedPaneEx();
    }
}