package ru.mirea.task7.ms;

public class Movablecircle implements Movable{

    private int radius;
    private Movablepoint center;

    public Movablecircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.radius = radius;
        this.center = new Movablepoint(x,y,xSpeed,ySpeed);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    public void moveup() { center.moveup(); }

    public void movedown() { center.movedown(); }

    public void moveleft() { center.moveleft(); }

    public void moveright() { center.moveright(); }
}
