package com.company;


import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Test_Grila_Geografie implements ActionListener {


    String[] questionsGeografie = {
            "Inainte sa-si dea seama ca este rotund, oamenii au crezut ca Pamantul este?",
            "Un glob este o minge care arata?",
            "Cel mai mare continent este?",
            "Cel mai mic continent?",
            "Pentru o singura intoarcere in jurul axei sale, Pamantul are nevoie de?"

    };
    String[][] optionsGeografie =
            {
                    {"piramida","cub","farfurie plata"},
                    {"vedere redusa  Universului","vedere redusa de stele","vedere redusa Pamantului"},
                    {"Afrika", "Asia", "Europa"},
                    {"Antarctica","Europa","Australia"},
                    {"24h","48h","72h"}
            };
    char[] answersGeografie =
            {
                    'C',
                    'C',
                    'B',
                    'C',
                    'A'
            };


    char answer;
    int index;
    int corect_quesses = 0;
    int total_questions = questionsGeografie.length;
    int results;
    int seconds = 10;


    JFrame frame6 = new JFrame();
    JTextField textfield1 = new JTextField();
    JTextArea textarea1 = new JTextArea();
    JRadioButton radioButtonA = new JRadioButton("A");
    JRadioButton radioButtonB = new JRadioButton("B");
    JRadioButton radioButtonC = new JRadioButton("C");
    JLabel labelA = new JLabel();
    JLabel labelB = new JLabel();
    JLabel labelC = new JLabel();
    JTextField number_right = new JTextField();
    JTextField percentage = new JTextField();
    JButton buttonMain = new JButton();
    JLabel time_label = new JLabel();
    JLabel seconds_left = new JLabel();


    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            seconds--;
            seconds_left.setText(String.valueOf(seconds));
            if (seconds <= 0){
                displayAnswer();
            }

        }
    });




    public Test_Grila_Geografie()
    {
        frame6.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame6.setSize(750, 700);
        frame6.getContentPane().setBackground(new Color(50, 50, 50));
        frame6.setLayout(null);
        frame6.setResizable(false);
        frame6.setVisible(true);
        frame6.setTitle("Test Grila Geografie");
        frame6.setLocation(400,100);


        textfield1.setBounds(0, 0, 750, 50);
        textfield1.setBackground(new Color(25, 25, 25));
        textfield1.setForeground(new Color(25, 200, 0));
        textfield1.setFont(new Font("Arial", Font.BOLD, 30));
        textfield1.setBorder(BorderFactory.createBevelBorder(1));
        textfield1.setHorizontalAlignment(JTextField.CENTER);
        textfield1.setEditable(false);
        textfield1.setText("Test Grila Geografie");


        textarea1.setBounds(0, 50, 750, 100);
        textarea1.setLineWrap(true);
        textarea1.setWrapStyleWord(true);
        textarea1.setBackground(new Color(25, 25, 25));
        textarea1.setForeground(new Color(25, 255, 0));
        textarea1.setFont(new Font("Arial", Font.BOLD, 30));
        textarea1.setBorder(BorderFactory.createBevelBorder(1));
        textarea1.setEditable(false);
        textarea1.setText("Inrebarile: ");



        radioButtonA.setBounds(50,200,100,30);
        radioButtonA.setFocusable(false);
        radioButtonA.addActionListener(this);



        radioButtonB.setBounds(50,300,100,30);
        radioButtonB.setFocusable(false);
        radioButtonB.addActionListener(this);



        radioButtonC.setBounds(50,400,100,30);
        radioButtonC.setFocusable(false);
        radioButtonC.addActionListener(this);



        labelA.setBounds(200,200,500,40);
        labelA.setBackground(new Color(50,50,50));
        labelA.setForeground(new Color(25,255,0));
        labelA.setFont(new Font("Arial",Font.PLAIN,35));


        labelB.setBounds(200,300,500,40);
        labelB.setBackground(new Color(50,50,50));
        labelB.setForeground(new Color(25,255,0));
        labelB.setFont(new Font("Arial",Font.PLAIN,35));


        labelC.setBounds(200,400,500,40);
        labelC.setBackground(new Color(50,50,50));
        labelC.setForeground(new Color(25,255,0));
        labelC.setFont(new Font("Arial",Font.PLAIN,35));


        number_right.setBounds(280,225,200,100);
        number_right.setBackground(new Color(25,25,25));
        number_right.setForeground(new Color(25,255,0));
        number_right.setFont(new Font("Arial",Font.BOLD,50));
        number_right.setBorder(BorderFactory.createBevelBorder(1));
        number_right.setHorizontalAlignment(JTextField.CENTER);
        number_right.setEditable(false);


        percentage.setBounds(280,325,200,100);
        percentage.setBackground(new Color(25,25,25));
        percentage.setForeground(new Color(25,255,0));
        percentage.setFont(new Font("Arial",Font.BOLD,50));
        percentage.setBorder(BorderFactory.createBevelBorder(1));
        percentage.setHorizontalAlignment(JTextField.CENTER);
        percentage.setEditable(false);



        buttonMain.setBounds(570, 600, 150, 40);
        buttonMain.setBackground(new Color(252, 252, 252));
        buttonMain.setForeground(new Color(25,25,25));
        buttonMain.setFont(new Font("Arial", Font.BOLD, 30));
        buttonMain.addActionListener(this);
        buttonMain.setText("Home!");
        buttonMain.setVisible(false);


        seconds_left.setBounds(640,570,100,100);
        seconds_left.setBackground(new Color(25,25,25));
        seconds_left.setForeground(new Color(255,0,0));
        seconds_left.setFont(new Font("Ink Free", Font.BOLD, 60));
        seconds_left.setBorder(BorderFactory.createBevelBorder(1));
        seconds_left.setOpaque(true);
        seconds_left.setHorizontalAlignment(JTextField.CENTER);
        seconds_left.setText(String.valueOf((seconds)));

        time_label.setBounds(620,540,100,25);
        time_label.setBackground(new Color(50,50,50));
        time_label.setForeground(new Color(255,0,0));
        time_label.setFont(new Font("MV Boli", Font.PLAIN,20));
        time_label.setHorizontalAlignment(JTextField.CENTER);
        time_label.setText("TIMER:");


        frame6.add(buttonMain);
        frame6.add(labelC);
        frame6.add(labelB);
        frame6.add(labelA);
        frame6.add(radioButtonC);
        frame6.add(radioButtonB);
        frame6.add(radioButtonA);
        frame6.add(textarea1);
        frame6.add(textfield1);
        frame6.add(seconds_left);
        frame6.add(time_label);
        frame6.setVisible(true);


        nextQuestion();

    }

    public void nextQuestion()
    {

        if (index >= total_questions)
        {
            results();
        }
        else
        {
            textfield1.setText("Inrebarea" + (index + 1));
            textarea1.setText(questionsGeografie[index]);
            labelA.setText(optionsGeografie[index][0]);
            labelB.setText(optionsGeografie[index][1]);
            labelC.setText(optionsGeografie[index][2]);
            timer.start();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

        radioButtonA.setEnabled(false);
        radioButtonB.setEnabled(false);
        radioButtonC.setEnabled(false);

        if(e.getSource() == radioButtonA)
        {
            answer = 'A';
            if (answer ==answersGeografie[index])
            {
                corect_quesses++;
            }
        }

        if(e.getSource() == radioButtonB)
        {
            answer = 'B';
            if (answer ==answersGeografie[index])
            {
                corect_quesses++;
            }
        }

        if(e.getSource() == radioButtonC)
        {
            answer = 'C';
            if (answer ==answersGeografie[index])
            {
                corect_quesses++;
            }
        }
        if (e.getSource() == buttonMain) {
            new Teste_grila();

            frame6.setVisible(false);
            frame6.dispose();

        }

        displayAnswer();
    }

    public void displayAnswer()
    {

        timer.stop();
        radioButtonA.setEnabled(false);
        radioButtonB.setEnabled(false);
        radioButtonC.setEnabled(false);


        if (answersGeografie[index] != 'A')
            labelA.setForeground(new Color(255,0,0));
        if (answersGeografie[index] != 'B')
            labelB.setForeground(new Color(255,0,0));
        if (answersGeografie[index] != 'C')
            labelC.setForeground(new Color(255,0,0));

        Timer pause = new Timer (2000, new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                labelA.setForeground(new Color(25,255,0));
                labelB.setForeground(new Color(25,255,0));
                labelC.setForeground(new Color(25,255,0));

                answer = ' ';
                seconds=10;
                seconds_left.setText(String.valueOf(seconds));
                radioButtonA.setEnabled(true);
                radioButtonB.setEnabled(true);
                radioButtonC.setEnabled(true);

                // ovde se anselektuju radio butoni
                radioButtonA.setSelected(false);
                radioButtonB.setSelected(false);
                radioButtonC.setSelected(false);
                index++;
                nextQuestion();
            }

        });
        pause.setRepeats(false);
        pause.start();
    }

    private void results()
    {

        radioButtonA.setEnabled(false);
        radioButtonB.setEnabled(false);
        radioButtonC.setEnabled(false);

        results = (int)((corect_quesses/(double)total_questions)*100);
        textfield1.setText("Rezultate! ");
        labelA.setText(" ");
        labelB.setText(" ");
        labelC.setText(" ");

        number_right.setText("("+corect_quesses+"/"+total_questions+")");
        percentage.setText(results+"%");

        buttonMain.setVisible(true);

        frame6.add(percentage);
        frame6.add(number_right);

        radioButtonA.setVisible(false);
        radioButtonB.setVisible(false);
        radioButtonC.setVisible(false);
        textarea1.setVisible(false);
        time_label.setVisible(false);
        seconds_left.setVisible(false);
    }
}
