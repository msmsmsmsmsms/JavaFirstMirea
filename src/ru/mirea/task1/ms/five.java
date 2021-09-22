package ru.mirea.task1.ms;

import java.util.Scanner;

public class five {
    static public int find_fac(int k){
        int fac = 1;
        while (k!=0) {
            fac *= k;
            k--;
        }
        return fac;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int k = in.nextInt();

        System.out.println("Факториал " + k + " равен " + find_fac(k));

        System.exit(0);
    }
}
