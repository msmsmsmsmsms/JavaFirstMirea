package ru.mirea.task7.ms;

class Square extends Rectangle
{
    public double side;

    public Square(){}
    public Square(double s)
    {
        side = s;
    }
    public Square(double s, String c, boolean f)
    {
        side = s;
        color = c;
        filled = f;
    }

    public double getSide()
    {
        return this.side;
    }

    public void setSide()
    {
        this.side = side;
    }

    public void setWidth(double side)
    {
        width = side;
    }

    public void setLength(double side)
    {
        length = side;
    }

    public String toString()
    {
        return "color is " + color;
    }
}
