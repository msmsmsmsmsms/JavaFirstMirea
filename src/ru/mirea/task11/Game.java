package ru.mirea.task11;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Game extends JFrame {

    private JButton submit = new JButton("Ответ");
    private JLabel result;
    private JTextField insert;
    private JLabel attemptsAmount;
    private int random = (int)(Math.random() * 20);
    private int attempts = 3;
    private Font Mainfont = new Font("Arial", 0, 30);

    public Game(){

        Container c = getContentPane();
        c.setLayout(null);
        setTitle("Угадай число!");
        setLocation(0,0);
        setExtendedState(Frame.MAXIMIZED_BOTH);

        submit.setBounds(850, 850, 180, 100);
        submit.setFont(Mainfont);
        add(submit);

        result = new JLabel();
        result.setBounds(700,100, 600,100);
        result.setFont(Mainfont);
        add(result);

        attemptsAmount = new JLabel(String.format("Попыток осталось: %d", attempts));
        attemptsAmount.setBounds(1050,100, 600,100);
        attemptsAmount.setFont(Mainfont);
        add(attemptsAmount);

        insert = new JTextField();
        insert.setToolTipText("Ваше значение");
        insert.setFont(Mainfont);
        insert.setBounds(850, 300, 180, 100);
        insert.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                String val = insert.getText();
                int len = val.length();
                insert.setEditable((e.getKeyChar() >= '0' && e.getKeyChar() <= '9') || e.getKeyChar() == '\b');
            }
        });
        add(insert);

        submit.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent aa){}
            public void mouseClicked(MouseEvent aa){
                int txt = Integer.valueOf(insert.getText());
                insert.setText((""));
                if (txt != random) {
                    if (txt < random) result.setText("Больше");
                    else result.setText("Меньше");
                }
                else {
                    attemptsAmount.setText(String.format("Попыток осталось: %d", --attempts));
                    result.setText("Победа!");
                    return;
                }
                attemptsAmount.setText(String.format("Попыток осталось: %d", --attempts));
                if (attempts == 0){
                    result.setText("Поражение :(");
                }
            }
            public void mouseEntered(MouseEvent aa) {}
            public void mouseReleased(MouseEvent aa) {}
            public void mousePressed(MouseEvent aa) {}
        });


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Game();
    }

}
