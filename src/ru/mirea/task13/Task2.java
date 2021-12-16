package ru.mirea.task13;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<String>();

        animals.addFirst("Cat");
        animals.addFirst("Dog");
        animals.addLast("Lion");

        animals.add(2,"Tiger");

        System.out.println(animals.getFirst());

        for(String a:animals)
            System.out.print(a+" ");

        animals.removeLast();
        System.out.println();
        for(String a:animals)
            System.out.print(a+" ");
    }
}