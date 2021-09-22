package ru.mirea.task5.ms;

public abstract class Dog {
    public boolean tail;
    public boolean cute;
    public String paws;
    public int size;

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public boolean isCute() {
        return cute;
    }

    public void setCute(boolean cute) {
        this.cute = cute;
    }

    public String getPaws() {
        return paws;
    }

    public void setPaws(String paws) {
        this.paws = paws;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static void main(String[] args) {
        Corgi dog1 = new Corgi();
        System.out.println(dog1.toString());

        pitbull dog2 = new pitbull();
        System.out.println(dog2.toString());
    }
}
