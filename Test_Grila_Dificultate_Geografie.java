package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test_Grila_Dificultate_Geografie implements ActionListener {



    JFrame frame5 = new JFrame();
    JButton buttonHard = new JButton();
    JButton buttonMedium = new JButton();
    JButton buttonEasy = new JButton();
    JTextField textFieldPrimuecran = new JTextField();
    JButton backButton = new JButton();





    public Test_Grila_Dificultate_Geografie()
    {

        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame5.setSize(750, 700);
        frame5.getContentPane().setBackground(new Color(50, 50, 50));
        frame5.setLayout(null);
        frame5.setResizable(false);
        frame5.setTitle("Nivel de dificultate!");
        frame5.setLocation(400,100);


        textFieldPrimuecran.setBounds(0, 0, 750, 100);
        textFieldPrimuecran.setBackground(new Color(25, 25, 25));
        textFieldPrimuecran.setForeground(new Color(25, 200, 0));
        textFieldPrimuecran.setFont(new Font("Arial", Font.BOLD, 30));
        textFieldPrimuecran.setBorder(BorderFactory.createBevelBorder(1));
        textFieldPrimuecran.setEditable(false);
        textFieldPrimuecran.setText("Selectati nivelu de dificultate din Grila Geografie! ");


        buttonEasy.setBounds(220, 200, 250, 50);
        buttonEasy.setBackground(new Color(252, 252, 252));
        buttonEasy.setForeground(new Color(25,25,25));
        buttonEasy.setFont(new Font("Arial", Font.BOLD, 30));
        buttonEasy.addActionListener( this);
        buttonEasy.setText("Lvl Easy");


        buttonMedium.setBounds(220, 300, 250, 50);
        buttonMedium.setBackground(new Color(252, 252, 252));
        buttonMedium.setForeground(new Color(25,25,25));
        buttonMedium.setFont(new Font("Arial", Font.BOLD, 30));
        buttonMedium.addActionListener(this);
        buttonMedium.setText("Lvl Medium");


        buttonHard.setBounds(220, 400, 250, 50);
        buttonHard.setBackground(new Color(252, 252, 252));
        buttonHard.setForeground(new Color(25,25,25));
        buttonHard.setFont(new Font("Arial", Font.BOLD, 30));
        buttonHard.addActionListener(this);
        buttonHard.setText("Lvl Hard");


        backButton.setBounds(550, 600, 150, 50);
        backButton.setBackground(new Color(225, 225, 225));
        backButton.setForeground(new Color(7, 0, 0));
        backButton.setFont(new Font("Arial", Font.BOLD, 30));
        backButton.addActionListener(this);
        backButton.setText("Inapoi");


        frame5.add(backButton);
        frame5.add(textFieldPrimuecran);
        frame5.add(buttonEasy);
        frame5.add(buttonMedium);
        frame5.add(buttonHard);
        frame5.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonEasy) {
            new Test_Grila_Geografie();

            frame5.setVisible(false);
            frame5.dispose();
        }
        if (e.getSource() == buttonMedium) {
            new Test_Grila_Geografie1();

            frame5.setVisible(false);
            frame5.dispose();
        }

        if (e.getSource() == buttonHard) {
            new Test_Grila_Geografie2();

            frame5.setVisible(false);
            frame5.dispose();
        }
        if (e.getSource() == backButton) {
            new Teste_grila();

            frame5.setVisible(false);
            frame5.dispose();
        }

    }
}
