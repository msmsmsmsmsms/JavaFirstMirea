package ru.mirea.task5.ms;

public class Plate extends Dish{

    public double radius;

    public Plate(int p, String c, int a, int r){
        this.color = c;
        this.amount = a;
        this.price = p;
        this.radius = r;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "price=" + price +
                ", amount=" + amount +
                ", color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }
}
