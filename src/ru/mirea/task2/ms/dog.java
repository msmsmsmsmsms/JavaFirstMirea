package ru.mirea.task2.ms;

public class dog {
    private String name;
    private int age;

    public dog(String n, int a) {
        name = n;
        age = a;
    }
    public dog(String n) {
        name = n;
        age = 0;
    }
    public dog() {
        name = "Pup";
        age = 0;
    }
    public void setage(int age)
    {
        this.age = age;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public String getname(String name)
    {
        return name;
    }
    public int getage()
    {
        return age;
    }
    public void intohumanage()
    {
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }

    @Override
    public String toString() {
        return "dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
