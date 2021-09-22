package ru.mirea.task6.ms;

public class Planet implements Nameable{
    public String name;
    public Planet(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Planet Earth = new Planet("Earth");
        System.out.println(Earth.getName());
    }
}
