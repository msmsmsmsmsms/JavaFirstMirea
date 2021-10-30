package ru.mirea.task10;

import java.util.Scanner;

public class Task14 {
    private int number;

    public Task14() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        number = in.nextInt();
        rec(number);
    }

    private void rec(int number){
        if(number > 0) rec(number/10);
        else return;
        System.out.println(number%10);
    }

    public static void main(String[] args) {
        new Task14();
    }
}
