package ru.mirea.task5.ms;

public class Table extends Furniture{
    public double height;
    public double width;
    public double length;

    public Table(String material, String color, int length, int width, int height){
        this.material = material;
        this.color = color;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Table{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", length=" + length +
                ' ';
    }
}
