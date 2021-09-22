package ru.mirea.task2.ms;

public class ShapeTest {
    public static void main(String[] args) {
        Shape square = new Shape(5,5);
        System.out.println(square.sqr());
        System.out.println(square.toString());
    }
}
