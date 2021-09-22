package ru.mirea.task2.ms;

import java.util.Scanner;

public class dogTest {

    public static void add_dog(dog dog_arr[], int amount){
        for (int i=0; i<amount; i++){

            Scanner name_in = new Scanner(System.in);
            String name = name_in.next();

            Scanner age_in = new Scanner(System.in);
            int age = age_in.nextInt();

            dog_arr[i] = new dog(name,age);
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество собак");
        int amount = in.nextInt();
        dog dog_arr[] = new dog[amount];
        add_dog(dog_arr, amount);

        for (int i=0; i<amount; i++){
            System.out.println(dog_arr[i].toString());
        }

    }
}
