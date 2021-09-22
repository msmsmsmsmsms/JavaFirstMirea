package ru.mirea.task5.ms;

public abstract class Dish {
    public int price;
    public int amount;
    public String color;

    public static void main(String[] args) {
        Cup cup = new Cup(7,"white", 2, 0.5);
        System.out.println(cup.toString());

        Plate plate = new Plate(13,"black", 10, 5);
        System.out.println(plate.toString());
    }
}