package ru.mirea.task1.ms;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        int [] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
        }

        int s_for = 0;
        int s_while = 0;
        int s_do_while = 0;

        for(int i=0; i<10; i++) {
            s_for += arr[i];
        }

        int k1 = 9;
        while(k1!=-1) {
            s_while += arr[k1];
            k1--;
        }

        int k2 = 9;
        do {
            s_do_while += arr[k2];
            k2--;
        }
        while(k2!=-1);

        System.out.println("Сумма через for = " + s_for);
        System.out.println("Сумма через while = " + s_while);
        System.out.println("Сумма через do while = " + s_do_while);
    }
}
