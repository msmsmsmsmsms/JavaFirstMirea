package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Game2 extends JFrame {

    private JButton North = new JButton("North");
    private JButton South = new JButton("South");
    private JButton West = new JButton("West");
    private JButton East = new JButton("East");

    public Game2(){
        Container c = getContentPane();
        c.setLayout(null);
        setTitle("Game2");
        setLocation(0,0);
        setExtendedState(Frame.MAXIMIZED_BOTH);

        North.setBounds(900,100,100,50);
        add(North);

        South.setBounds(900,900,100,50);
        add(South);

        West.setBounds(100,500,100,50);
        add(West);

        East.setBounds(1700,500,100,50);
        add(East);

        North.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) { JOptionPane.showMessageDialog( null, "Welcome to North"); }
            public void mouseExited(MouseEvent e) {}
        });

        South.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) { JOptionPane.showMessageDialog( null, "Welcome to South"); }
            public void mouseExited(MouseEvent e) {}
        });

        West.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) { JOptionPane.showMessageDialog( null, "Welcome to West"); }
            public void mouseExited(MouseEvent e) {}
        });

        East.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) { JOptionPane.showMessageDialog( null, "Welcome to East"); }
            public void mouseExited(MouseEvent e) {}
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Game2();
    }

}
