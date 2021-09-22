package ru.mirea.task6.ms;

public class Notebook implements Priceable{
    public int price;
    public Notebook(int price){
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Notebook Mac = new Notebook(999);
        System.out.println(Mac.getPrice());
    }
}
