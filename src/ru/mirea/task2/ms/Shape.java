package ru.mirea.task2.ms;

public class Shape {
    public double length;
    public double width;

    public Shape (double l, double w){
        length = l;
        width = w;
    }

    public double sqr(){
        return this.width * this.length;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
