package ru.mirea.task6.ms;

public class Car implements Nameable{
    public String name;

    public Car(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Car BMW = new Car("BMW");
        System.out.println(BMW.getName());
    }
}
