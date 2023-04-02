package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test_Grila_Dificultate implements ActionListener {



    JFrame frame1 = new JFrame();
    JButton buttonHard = new JButton();
    JButton buttonMedium = new JButton();
    JButton buttonEasy = new JButton();
    JTextField textFieldPrimuecran = new JTextField();
    JButton backButton = new JButton();

    public Test_Grila_Dificultate()
    {

        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(700, 700);
        frame1.getContentPane().setBackground(new Color(50, 50, 50));
        frame1.setLayout(null);
        frame1.setResizable(false);
        frame1.setTitle("Nivel de dificultate!");
        frame1.setLocation(400,100);


        textFieldPrimuecran.setBounds(0, 0, 700, 100);
        textFieldPrimuecran.setBackground(new Color(25, 25, 25));
        textFieldPrimuecran.setForeground(new Color(25, 200, 0));
        textFieldPrimuecran.setFont(new Font("Arial", Font.BOLD, 30));
        textFieldPrimuecran.setBorder(BorderFactory.createBevelBorder(1));
        textFieldPrimuecran.setEditable(false);
        textFieldPrimuecran.setText("Selectati nivelu de dificultate din Grila Sport! ");


        buttonEasy.setBounds(200, 200, 250, 50);
        buttonEasy.setBackground(new Color(252, 252, 252));
        buttonEasy.setForeground(new Color(25,25,25));
        buttonEasy.setFont(new Font("Arial", Font.BOLD, 30));
        buttonEasy.addActionListener( this);
        buttonEasy.setText("Lvl Easy");


        buttonMedium.setBounds(200, 300, 250, 50);
        buttonMedium.setBackground(new Color(252, 252, 252));
        buttonMedium.setForeground(new Color(25,25,25));
        buttonMedium.setFont(new Font("Arial", Font.BOLD, 30));
        buttonMedium.addActionListener(this);
        buttonMedium.setText("Lvl Medium");


        buttonHard.setBounds(200, 400, 250, 50);
        buttonHard.setBackground(new Color(252, 252, 252));
        buttonHard.setForeground(new Color(25,25,25));
        buttonHard.setFont(new Font("Arial", Font.BOLD, 30));
        buttonHard.addActionListener(this);
        buttonHard.setText("Lvl Hard");


        backButton.setBounds(500, 600, 150, 50);
        backButton.setBackground(new Color(252, 252, 252));
        backButton.setForeground(new Color(7, 0, 0));
        backButton.setFont(new Font("Arial", Font.BOLD, 30));
        backButton.addActionListener(this);
        backButton.setText("Inapoi");



        frame1.add(backButton);
        frame1.add(textFieldPrimuecran);
        frame1.add(buttonEasy);
        frame1.add(buttonMedium);
        frame1.add(buttonHard);
        frame1.setVisible(true);

    }


    @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == buttonEasy) {
                new Test_Grila_Sport();

                frame1.setVisible(false);
                frame1.dispose();
            }
            if (e.getSource() == buttonMedium) {
                new Test_Grila_Sport1();

                frame1.setVisible(false);
                frame1.dispose();
        }

            if (e.getSource() == buttonHard) {
                new Test_Grila_Sport2();

                frame1.setVisible(false);
                frame1.dispose();
        }
        if (e.getSource() == backButton) {
            new Teste_grila();

            frame1.setVisible(false);
            frame1.dispose();

        }

    }
}








