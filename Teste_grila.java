package com.company;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Teste_grila implements ActionListener {


    JFrame frame = new JFrame();
    JTextField textfield = new JTextField();
    JTextArea textarea = new JTextArea();
    JButton buttonSport = new JButton();
    JButton buttonGeografie = new JButton();
    JButton buttonLogOut = new JButton();


    public Teste_grila() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 650);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setTitle("Test Grila!");
        frame.setLocation(400,100);


        textfield.setBounds(0, 0, 650, 50);
        textfield.setBackground(new Color(25, 25, 25));
        textfield.setForeground(new Color(25, 255, 0));
        textfield.setFont(new Font("Ink Free", Font.BOLD, 30));
        textfield.setBorder(BorderFactory.createBevelBorder(1));
        textfield.setHorizontalAlignment(JTextField.CENTER);
        textfield.setEditable(false);
        textfield.setText("Bine ati venit!!");


        textarea.setBounds(0, 50, 650, 50);
        textarea.setLineWrap(true);
        textarea.setWrapStyleWord(true);
        textarea.setBackground(new Color(25, 25, 25));
        textarea.setForeground(new Color(25, 255, 0));
        textarea.setFont(new Font("Arial", Font.BOLD, 30));
        textarea.setBorder(BorderFactory.createBevelBorder(1));
        textarea.setEditable(false);
        textarea.setText("Selectati o zona din care doriti testarea!");


        buttonSport.setBounds(0, 100, 650, 100);
        buttonSport.setFont(new Font("Arial", Font.BOLD, 30));
        buttonSport.setFocusable(false);
        buttonSport.addActionListener(this);
        buttonSport.setText("Test Grila Sport!");

        buttonGeografie.setBounds(0, 200, 650, 100);
        buttonGeografie.setFont(new Font("Arial", Font.BOLD, 30));
        buttonGeografie.setFocusable(false);
        buttonGeografie.addActionListener(this);
        buttonGeografie.setText("Test Grila Geografie!");


        buttonLogOut.setBounds(450, 520, 180, 50);
        buttonLogOut.setFont(new Font("Arial", Font.BOLD, 30));
        buttonLogOut.setFocusable(false);
        buttonLogOut.addActionListener(this);
        buttonLogOut.setText("Log Out");



        frame.add(buttonSport);
        frame.add(buttonGeografie);
        frame.add(textarea);
        frame.add(textfield);
        frame.add(buttonLogOut);
        frame.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonSport) {
            new Test_Grila_Dificultate();

            frame.setVisible(false);
            frame.dispose();

        }

        if (e.getSource() == buttonGeografie) {
            new Test_Grila_Dificultate_Geografie();

            frame.setVisible(false);
            frame.dispose();

        }

        if (e.getSource() == buttonLogOut){
            new LoginFrame();

            frame.setVisible(false);
            frame.dispose();
        }


    }
}




