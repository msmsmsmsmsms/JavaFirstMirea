package ru.mirea.task7.ms;

public class Movablerectangle implements Movable {
    private Movablepoint topLeft;
    private Movablepoint bottomRight;

    public Movablerectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        this.topLeft = new Movablepoint(x1,y1,xSpeed,ySpeed);
        this.bottomRight = new Movablepoint(x2,y2,xSpeed,ySpeed);
    }

    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    public void moveup() {
        topLeft.moveup();
        bottomRight.moveup();
    }

    public void movedown() {
        topLeft.movedown();
        bottomRight.movedown();
    }

    public void moveleft() {
        topLeft.moveleft();
        bottomRight.moveleft();
    }

    public void moveright() {
        topLeft.moveright();
        bottomRight.moveright();
    }
}
