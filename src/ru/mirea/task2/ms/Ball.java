package ru.mirea.task2.ms;

public class Ball {
    private int size;
    private String colour;
    private String owner;

    public Ball(int size, String colour, String owner) {
        this.size = size;
        this.colour = colour;
        this.owner = owner;
    }

    public Ball(int s, String c) {
        size = s;
        colour = c;
        owner = "Nobody";
    }

    public void setsize(int size)
    {
        this.size = size;
    }

    public void setowner(String owner)
    {
        this.owner = owner;
    }

    public void setcolour(String colour)
    {
        this.colour = colour;
    }

    public void getowner() {
        System.out.println(this.owner + " owns " + this.colour + " ball");
    }
}
