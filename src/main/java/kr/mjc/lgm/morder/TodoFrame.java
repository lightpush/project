package kr.mjc.lgm.morder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TodoFrame extends JFrame implements ActionListener {

    private JTextField todoTextField;
    private JTextArea todoListArea;
    private JButton addButton;
    private JButton removeButton;
    private JButton clearButton;
    
    public TodoFrame() {
        // 프레임 설정
        setTitle("TODO List");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // 컴포넌트 생성
        todoTextField = new JTextField(20);
        todoListArea = new JTextArea(10, 20);
        todoListArea.setEditable(false); // 편집 불가능하도록 설정
        addButton = new JButton("Add");
        removeButton = new JButton("Remove");
        clearButton = new JButton("Clear");
        
        // 버튼에 액션 리스너 등록
        addButton.addActionListener(this);
        removeButton.addActionListener(this);
        clearButton.addActionListener(this);
        
        // 레이아웃 설정
        JPanel contentPanel = new JPanel(new BorderLayout());
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);
        buttonPanel.add(clearButton);
        contentPanel.add(todoTextField, BorderLayout.NORTH);
        contentPanel.add(new JScrollPane(todoListArea), BorderLayout.CENTER);
        contentPanel.add(buttonPanel, BorderLayout.SOUTH);
        setContentPane(contentPanel);
        
        // 프레임 크기 설정 및 보이기
        pack();
        setLocationRelativeTo(null); // 화면 가운데에 위치하도록 설정
        setVisible(true);
    }
    
    // 버튼 클릭 이벤트 처리
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Add")) {
            String todoItem = todoTextField.getText();
            if (!todoItem.equals("")) {
                todoListArea.append(todoItem + "\n");
                todoTextField.setText("");
            }
        } else if (actionCommand.equals("Remove")) {
            String selectedText = todoListArea.getSelectedText();
            if (selectedText != null) {
                int start = todoListArea.getSelectionStart();
                int end = todoListArea.getSelectionEnd();
                todoListArea.replaceRange("", start, end);
            }
        } else if (actionCommand.equals("Clear")) {
            todoListArea.setText("");
        }
    }
    
    public static void main(String[] args) {
        new TodoFrame();
    }
}
