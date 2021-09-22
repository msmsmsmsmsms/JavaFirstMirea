package ru.mirea.task6.ms;

public class Phone implements Priceable{
    public int price;
    public Phone(int price){
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Phone iPhone = new Phone(799);
        System.out.println(iPhone.getPrice());
    }
}
