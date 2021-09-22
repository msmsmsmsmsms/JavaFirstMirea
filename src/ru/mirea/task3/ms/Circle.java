package ru.mirea.task3.ms;

public class Circle {
    public double radius;
    public Circle(){}
    public Circle(double r){
        radius = r;
    }

    public double findP(){
        return this.radius * 2 * 3.14;
    }

    public double findS(){
        return this.radius * this.radius * 3.14;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
