package ru.mirea.task10;

import java.util.Scanner;

public class Task15 {
    private int number;

    public Task15() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        number = in.nextInt();
        rec(number);
    }

    private void rec(int number){
        if(number > 0) System.out.println(number%10);
        else return;
        rec(number/10);
    }

    public static void main(String[] args) {
        new Task15();
    }
}