package ru.mirea.task10;

import java.util.Scanner;

public class Task16 {

    public Task16(){
        System.out.println("Количество вхождений максимума: " + rec(0,0));
    }

    private int rec(int max, int counter){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number == 0) return counter;
        else{
            if (number == max) return rec(max, counter + 1);
            else{
                if (number > max) return rec(number, 1);
                else return rec(max, counter);
            }
        }
    }

    public static void main(String[] args) {
        new Task16();
    }

}
