package ru.mirea.task3.ms;

public class Leg {
    public int size;    // <7 small, 7-11 - normal, >11 - big

    public Leg(int s){
        size = s;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
