package ru.mirea.task4.ms;

public class ball {
    private double x = 0.0;
    private double y = 0.0;

    public ball(){}
    public ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getx()
    {
        return x;
    }

    public double gety()
    {
        return y;
    }

    public void setx(double x)
    {
        this.x = x;
    }

    public void sety(double y)
    {
        this.y = y;
    }

    public void setxy(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        x+=xDisp;
        y+=yDisp;
    }

    public String toString()
    {
        return "ball @ (" + this.x + ", " + this.y + ").";
    }
}
