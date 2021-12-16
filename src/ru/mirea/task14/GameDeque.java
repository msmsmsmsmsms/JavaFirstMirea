package ru.mirea.task14;

import java.util.*;

public class GameDeque {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> fPlayer = new LinkedList<>();
        Deque<Integer> sPlayer = new LinkedList<>();
        System.out.println("Введите карты первого игрока: ");
        for (int i = 0; i < 5; i++)
            fPlayer.addLast(in.nextInt());
        System.out.println("Введите карты второго игрока: ");
        for (int i = 0; i < 5; i++)
            sPlayer.addLast(in.nextInt());
        int count = 0;
        while (!fPlayer.isEmpty() && !sPlayer.isEmpty()) {
            if (fPlayer.getFirst() == 0 && sPlayer.getFirst() == 9) {
                fPlayer.addLast(fPlayer.pollFirst());
                fPlayer.addLast(sPlayer.pollFirst());
                count++;
            } else if (fPlayer.getFirst() == 9 && sPlayer.getFirst() == 0) {
                sPlayer.addLast(fPlayer.pollFirst());
                sPlayer.addLast(sPlayer.pollFirst());
                count++;
            } else if (fPlayer.getFirst() > sPlayer.getFirst()) {
                fPlayer.addLast(fPlayer.pollFirst());
                fPlayer.addLast(sPlayer.pollFirst());
                count++;
            } else if (fPlayer.getFirst() < sPlayer.getFirst()) {
                sPlayer.addLast(fPlayer.pollFirst());
                sPlayer.addLast(sPlayer.pollFirst());
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