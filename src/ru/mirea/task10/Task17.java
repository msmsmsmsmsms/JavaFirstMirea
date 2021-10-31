package ru.mirea.task10;

import java.util.Scanner;

public class Task17 {

    public Task17(){
        System.out.println("Максимум: " + rec(0));
    }

    private int rec(int max){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number == 0) return max;
        else{
            if (number == max) return rec(max);
            else{
                if (number > max) return rec(number);
                else return rec(max);
            }
        }
    }

    public static void main(String[] args) {
        new Task17();
    }

}
