package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game3 extends JFrame {
    private JTextArea text;

    public Game3() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JMenuBar menu = new JMenuBar();
        JPanel pnl = new JPanel();
        add(pnl);

        text = new JTextArea("enter your text");
        text.setFont(new Font("TimesRoman",Font.PLAIN,16));
        text.setOpaque(true);
        pnl.add(text);

        menu.add(Color());
        menu.add(Font());

        setJMenuBar(menu);
        setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
    }

    private JMenu Color() {
        JMenu color = new JMenu("Color");

        JMenuItem color1 = new JMenuItem("Orange");
        JMenuItem color2 = new JMenuItem("Green");
        JMenuItem color3 = new JMenuItem("Purple");

        color.add(color1);
        color.add(color2);
        color.add(color3);

        color1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(new Color(197, 92, 45));
            }
        });

        color2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(new Color(100, 141, 133));
            }
        });

        color3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(new Color(152, 118, 170));
            }
        });

        return color;
    }

    private JMenu Font() {
        JMenu font = new JMenu("Font");

        JMenuItem font1 = new JMenuItem("16px");
        JMenuItem font2 = new JMenuItem("32px");
        JMenuItem font3 = new JMenuItem("48px");

        font.add(font1);
        font.add(font2);
        font.add(font3);

        font1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(new Font("TimesRoman", Font.PLAIN,16));
            }
        });

        font2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(new Font("TimesRoman", Font.PLAIN,32));
            }
        });

        font3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(new Font("TimesRoman",Font.PLAIN, 48));
            }
        });

        return font;
    }

    public static void main(String[] args) {
        new Game3();
    }
}
