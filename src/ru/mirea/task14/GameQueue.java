package ru.mirea.task14;

import java.util.*;

public class GameQueue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<Integer> fPlayer = new LinkedList<>();
        Queue<Integer> sPlayer = new LinkedList<>();
        System.out.println("Введите карты первого игрока: ");
        for (int i = 0; i < 5; i++)
            fPlayer.offer(in.nextInt());
        System.out.println("Введите карты второго игрока: ");
        for (int i = 0; i < 5; i++)
            sPlayer.offer(in.nextInt());
        int count = 0;
        while (!fPlayer.isEmpty() && !sPlayer.isEmpty()) {
            if (fPlayer.peek() == 0 && sPlayer.peek() == 9) {
                fPlayer.offer(fPlayer.poll());
                fPlayer.offer(sPlayer.poll());
                count++;
            } else if (fPlayer.peek() == 9 && sPlayer.peek() == 0) {
                sPlayer.offer(fPlayer.poll());
                sPlayer.offer(sPlayer.poll());
                count++;
            } else if (fPlayer.peek() > sPlayer.peek()) {
                fPlayer.offer(fPlayer.poll());
                fPlayer.offer(sPlayer.poll());
                count++;
            } else if (fPlayer.peek() < sPlayer.peek()) {
                sPlayer.offer(fPlayer.poll());
                sPlayer.offer(sPlayer.poll());
                count++;
            }
            if (count == 106)
                break;
        }
        if (count == 106)
            System.out.println("botva");
        else if (fPlayer.isEmpty())
            System.out.println("second " + count);
        else
            System.out.println("first " + count);
    }
}