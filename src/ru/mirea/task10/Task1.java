package ru.mirea.task10;

import java.util.Scanner;

public class Task1 {

    public Task1(){
        Scanner in = new Scanner(System.in);
        int k = 1;
        int n = in.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println(k + " ");
            if (i == (k * (k + 1) / 2)) k++;
        }
    }

    public static void main(String[] args) {
        new Task1();
    }
}
