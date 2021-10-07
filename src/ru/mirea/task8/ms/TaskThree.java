package ru.mirea.task8.ms;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TaskThree extends JPanel {
    private JFrame frame;
    private Timer timer;
    private Image image;
    public TaskThree() {
        frame = new JFrame("Third Task");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080);
        frame.add(this);
        frame.setVisible(true);
        image = new ImageIcon("src/ru/mirea/task8/ms/gif/0.gif").getImage();
        count = 1;
        timer = new Timer();
        timer.schedule(animate, 1, 100);
    }

    private int count = 1;
    TimerTask animate = new TimerTask() {

        public void run() {
            switch (count) {
                case 1:
                    image = new ImageIcon("src/ru/mirea/task8/ms/gif/0.gif").getImage();
                    break;
                case 2:
                    image = new ImageIcon("src/ru/mirea/task8/ms/gif/1.gif").getImage();
                    break;
                case 3:
                    image = new ImageIcon("src/ru/mirea/task8/ms/gif/2.gif").getImage();
                    break;
                case 4:
                    image = new ImageIcon("src/ru/mirea/task8/ms/gif/3.gif").getImage();
                    break;
                case 5:
                    image = new ImageIcon("src/ru/mirea/task8/ms/gif/4.gif").getImage();
                    break;
            }
            count++;
            if (count == 5) {
                count = 1;
            }
            repaint();
        }
    };

    public void paint(Graphics canvas) {
        canvas.drawImage(image, 0, 0,  null);
    }

    public static void main(String[] args) {
        new TaskThree();
    }
}
