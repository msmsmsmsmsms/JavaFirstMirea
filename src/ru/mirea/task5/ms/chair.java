package ru.mirea.task5.ms;

public class chair extends Furniture{
    public double height;
    public double width;
    public double length;

    public chair(String material, String color, int length, int width, int height){
        this.material = material;
        this.color = color;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "chair{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", length=" + length +
                ' ';
    }
}
