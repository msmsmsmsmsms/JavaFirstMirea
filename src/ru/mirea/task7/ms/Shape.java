package ru.mirea.task7.ms;

public abstract class Shape
{
    protected String color;
    protected boolean filled;

    public Shape(){}

    public Shape(String c, boolean f)
    {
        color = c;
        filled = f;
    }

    public String getColor()
    {
        return this.color;
    }

    public boolean isFilled()
    {
        return this.filled;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimetr();

    public String toString()
    {
        return "color is " + color;
    }
}
