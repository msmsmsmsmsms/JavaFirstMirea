package ru.mirea.task4.ms;

public class authortest {
    public static void main(String[] args) {
        author a1 = new author("Ann", "ann@mail.com", 'f');
        author a2 = new author("Jack", "jack@mail.com", 'm');
        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}
