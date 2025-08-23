package com.calculator;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;

public class CalculatorUI extends JFrame implements ActionListener {

    private JButton btnExample;
    private JTextField textField = new JTextField();

    public CalculatorUI() {
        setTitle("Calculator");
        setSize(300, 400);
        Uiint();
        setVisible(true);
    }

    private void Uiint() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        btnExample = new JButton("Click Me");
        setLayout(new BorderLayout());
        add(btnExample);
        add(textField, BorderLayout.CENTER);

        textField.setFont(new Font("Fira Code", Font.BOLD,24));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        add(textField, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(4, 4, 10, 10));

    }

    public void actionPerformed(ActionEvent e) {

    }
}
