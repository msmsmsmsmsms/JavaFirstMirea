package ru.mirea.task7.ms;

class Circle extends Shape
{
    protected double radius;

    public Circle(){}
    public Circle(double r)
    {
        radius = r;
    }
    public Circle(double r, String c, boolean f)
    {
        radius = r;
        color = c;
        filled = f;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public String toString()
    {
        return "color is " + color;
    }

    public double getArea()
    {
        return 3.14 * radius * radius;
    }
    public double getPerimetr()
    {
        return 2 * 3.14 * radius;
    }
}

