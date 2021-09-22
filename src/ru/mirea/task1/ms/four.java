package ru.mirea.task1.ms;

import java.util.Arrays;
import java.util.Random;

public class four {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] arr = new int[10];

        for (int i =0; i<10; i++){
            arr[i] = rand.nextInt(1000);
        }

        System.out.println("\nНе отсортированный массив ");
        for (int i =0; i<10; i++){
            System.out.print(arr[i] + " ");
        }

        Arrays.sort(arr);

        System.out.println("\nОтсортированный массив ");
        for (int i =0; i<10; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
