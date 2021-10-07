package ru.mirea.task7.ms;

class Rectangle extends Shape
{
    protected double width;
    protected double length;

    public Rectangle(){}
    public Rectangle(double w, double l)
    {
        width = w;
        length = l;
    }
    public Rectangle(double w, double l, String c, boolean f)
    {
        width = w;
        length = l;
        color = c;
        filled = f;
    }

    public double getWidth()
    {
        return this.width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getLength()
    {
        return this.length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public double getArea()
    {
        return width * length;
    }

    public double getPerimetr()
    {
        return width + width + length + length;
    }

    public String toString()
    {
        return "color is " + color;
    }
}

