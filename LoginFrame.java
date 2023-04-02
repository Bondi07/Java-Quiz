package com.company;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class LoginFrame implements ActionListener {


    JFrame framelogin = new JFrame();
    Container container = framelogin.getContentPane();      // PENTRU A PUTEA SCRIE IN JLABEL
    JLabel labelUsername = new JLabel("USERNAME:");
    JLabel labelPasword = new JLabel("PASSWORD:");
    JTextField text = new JTextField();
    JTextField textusername = new JTextField();
    JPasswordField paswordfild = new JPasswordField();
    JButton butonlogin = new JButton();
    JButton butonreset = new JButton();
    JCheckBox showpasword = new JCheckBox("Arata parola");



    public LoginFrame() {

        framelogin.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        framelogin.setSize(500, 700);
        framelogin.getContentPane().setBackground(new Color(50, 50, 50));
        framelogin.setLayout(null);
        framelogin.setResizable(false);
        framelogin.setVisible(true);
        framelogin.setTitle("Login Frame");
        framelogin.setLocation(400,100);



        text.setBounds(150, 100, 100, 50);
        text.setBackground(new Color(25, 25, 25));
        text.setForeground(new Color(25, 200, 0));
        text.setFont(new Font("Arial", Font.BOLD, 30));
        text.setBorder(BorderFactory.createBevelBorder(1));
        text.setHorizontalAlignment(JTextField.CENTER);
        text.setEditable(false);
        text.setText("Login:");


        textusername.setBounds(150, 180, 200, 40);
        textusername.setBackground(new Color(25, 25, 25));
        textusername.setForeground(new Color(25, 200, 0));
        textusername.setFont(new Font("Arial", Font.BOLD, 30));
        textusername.setBorder(BorderFactory.createBevelBorder(1));
        textusername.setHorizontalAlignment(JTextField.CENTER);
        textusername.setEditable(true);


        labelUsername.setBounds(20, 180, 200, 30);
        labelUsername.setBackground(new Color(7, 0, 0));
        labelUsername.setForeground(new Color(25, 255, 0));
        labelUsername.setFont(new Font("Arial", Font.BOLD, 20));


        labelPasword.setBounds(20, 230, 200, 30);
        labelPasword.setBackground(new Color(7, 0, 0));
        labelPasword.setForeground(new Color(25, 255, 0));
        labelPasword.setFont(new Font("Arial", Font.BOLD, 20));


        paswordfild.setBounds(150, 230, 200, 40);
        paswordfild.setBackground(new Color(25, 25, 25));
        paswordfild.setForeground(new Color(25, 200, 0));
        paswordfild.setFont(new Font("Arial", Font.BOLD, 30));
        paswordfild.setBorder(BorderFactory.createBevelBorder(1));
        paswordfild.setHorizontalAlignment(JTextField.CENTER);
        paswordfild.setEditable(true);


        butonlogin.setBounds(80, 300, 120, 40);
        butonlogin.setBackground(new Color(252, 252, 252));
        butonlogin.setForeground(new Color(25, 25, 25));
        butonlogin.setFont(new Font("Arial", Font.BOLD, 20));
        butonlogin.addActionListener(this);
        butonlogin.setText("LOGIN!");


        butonreset.setBounds(250, 300, 120, 40);
        butonreset.setBackground(new Color(252, 252, 252));
        butonreset.setForeground(new Color(25, 25, 25));
        butonreset.setFont(new Font("Arial", Font.BOLD, 20));
        butonreset.addActionListener(this);
        butonreset.setText("RESET!");


        showpasword.setBounds(150, 270, 100, 20);
        showpasword.addActionListener(this);
        showpasword.setFocusable(false);
        showpasword.setBackground(new Color(25, 25, 25));
        showpasword.setForeground(new Color(25, 255, 0));


        framelogin.add(butonreset);
        framelogin.add(showpasword);
        framelogin.add(butonlogin);
        framelogin.add(paswordfild);
        framelogin.add(labelPasword);
        framelogin.add(labelUsername);
        framelogin.add(textusername);
        framelogin.add(text);

        setLeyautManager();
    }

    public void setLeyautManager() {
        container.setLayout(null);

        AdCompomentToContainer();
    }

    public void AdCompomentToContainer() {
        container.add(textusername);
        container.add(paswordfild);
        container.add(labelPasword);
        container.add(labelUsername);
        container.add(butonlogin);
        container.add(showpasword);
        container.add(text);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == butonlogin) {
            String userText;
            String passwordText;
            userText = textusername.getText();
            passwordText = paswordfild.getText();
            if (userText.equalsIgnoreCase("nikola") && passwordText.equalsIgnoreCase("12345")) {
                new Teste_grila();
                framelogin.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(framelogin, "Invalid Username or Password");

            }

        }

        if (e.getSource() == showpasword) {
            if (showpasword.isSelected()) {
                paswordfild.setEchoChar((char) 0);
            } else {
                paswordfild.setEchoChar('*');
            }
        }

        if (e.getSource() == butonreset) {
            paswordfild.setText("");
            textusername.setText("");
        }
    }
}
