package ru.mirea.task8.ms;

import javax.swing.*;
import java.awt.*;


public class TaskTwo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Second Task");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920,1080);
        ImageIcon icon = new ImageIcon("");
        for (String arg : args)
        {
            icon = new ImageIcon(arg);
            break;
        }
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setVisible(true);
    }
}
