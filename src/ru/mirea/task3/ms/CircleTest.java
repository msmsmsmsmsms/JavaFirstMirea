package ru.mirea.task3.ms;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите радиус первой окружности");
        double radius = in.nextDouble();

        Circle c1 = new Circle(radius);
        System.out.println(c1.toString());
        System.out.println("Длина окружности = " + c1.findP());
        System.out.println("Площадь окружности = " + c1.findS());

        Circle c2 = new Circle();
        System.out.println("Введите радиус второй окружности");

        radius = in.nextDouble();
        c2.setRadius(radius);
        System.out.println(c2.toString());
        System.out.println("Длина окружности = " + c2.findP());
        System.out.println("Площадь окружности = " + c2.findS());
    }
}
