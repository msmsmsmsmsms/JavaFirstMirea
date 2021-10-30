package ru.mirea.task9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class App extends JFrame{
    private static JButton Milan_BTN = new JButton("Milan");
    private static JButton Real_BTN = new JButton("Real Madrid");
    private static JLabel Result_LBL;
    private static JLabel Scorer_LBL;
    private static JLabel Winner_LBL;
    private int Milan_score = 0;
    private int Real_score = 0;

    private void SetWindow(){
        Container c = getContentPane();
        c.setLayout(null);
        setTitle("App");
        setLocation(0,0);
        setSize(1920, 1080);
        setExtendedState(MAXIMIZED_BOTH);
    }

    public App(){
        SetWindow();
        Font MainFont = new Font("Arial", Font.PLAIN, 40);

        // Кнопка Милан
        Milan_BTN.setBounds(200, 100, 350, 150);
        Milan_BTN.setBackground(new Color(34, 140, 173, 255));
        Milan_BTN.setBorderPainted(false);
        Milan_BTN.setFocusPainted(false);
        Milan_BTN.setFont(MainFont);

        // Кнопка Реал
        Real_BTN.setBounds(1370,100,350,150);
        Real_BTN.setBackground(new Color(34, 140, 173, 255));
        Real_BTN.setBorderPainted(false);
        Real_BTN.setFont(MainFont);
        Real_BTN.setFocusPainted(false);

        // Итог
        Result_LBL = new JLabel(String.format("Result: %d x %d", Milan_score, Real_score));
        Result_LBL.setBounds(800,270,400,50);
        Result_LBL.setFont(MainFont);

        // Последний забивший
        Scorer_LBL = new JLabel("Last scorer: N/A");
        Scorer_LBL.setBounds(770,320,600,50);
        Scorer_LBL.setFont(MainFont);

        // Победитель
        Winner_LBL = new JLabel("Winner: DRAW");
        Winner_LBL.setBounds(770, 370, 500, 50);
        Winner_LBL.setFont(MainFont);

        add(Milan_BTN);
        add(Real_BTN);
        add(Result_LBL);
        add(Scorer_LBL);
        add(Winner_LBL);

        Milan_BTN.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                Result_LBL.setText(String.format("Result: %d x %d", ++Milan_score, Real_score));
                Scorer_LBL.setText("Last scorer: Milan");
                if(Milan_score > Real_score) Winner_LBL.setText("Winner: Milan");
                else if(Milan_score == Real_score) Winner_LBL.setText("Winner: Draw");
                else if(Milan_score < Real_score) Winner_LBL.setText("Winner: Real Madrid");
            }
            public void mousePressed(MouseEvent e) {}

            public void mouseReleased(MouseEvent e) {}

            public void mouseEntered(MouseEvent e) {}

            public void mouseExited(MouseEvent e) {}
        });

        Real_BTN.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Result_LBL.setText(String.format("Result: %d x %d", Milan_score, ++Real_score));
                Scorer_LBL.setText("Last scorer: Real Madrid");
                if(Milan_score > Real_score) Winner_LBL.setText("Winner: Milan");
                else if(Milan_score == Real_score) Winner_LBL.setText("Winner: Draw");
                else if(Milan_score < Real_score) Winner_LBL.setText("Winner: Real Madrid");
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args){
        App newApp = new App();
    }
}