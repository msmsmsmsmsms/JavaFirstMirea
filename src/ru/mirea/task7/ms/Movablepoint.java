package ru.mirea.task7.ms;

public class Movablepoint implements Movable {

    int x;
    int y;
    int xspeed;
    int yspeed;

    public Movablepoint(int _x, int _y, int _xspeed, int _yspeed){
        x = _x;
        y = _y;
        xspeed = _xspeed;
        yspeed = _yspeed;
    }
    public String toString()
    {
        return "x = " + x + "; y = " + y + "; xspeed = " + xspeed + "; yspeed = " + yspeed;
    }

    public void moveup() { this.y += this.yspeed; }

    public void movedown() { this.y -= this.yspeed; }

    public void moveleft() { this.x -= this.xspeed; }

    public void moveright() { this.x += this.xspeed; }
}
