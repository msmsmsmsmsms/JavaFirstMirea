package ru.mirea.task5.ms;

public class Cup extends Dish{

    public double capacity;

    public Cup(int p, String c, int a, double cap){
        this.color = c;
        this.amount = a;
        this.price = p;
        this.capacity = cap;
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

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "capacity=" + capacity +
                ", price=" + price +
                ", amount=" + amount +
                ", color='" + color + '\'' +
                '}';
    }
}
