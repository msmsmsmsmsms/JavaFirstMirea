package ru.mirea.task5.ms;

public class Corgi extends Dog{
    public Corgi(){
        cute = true;
        tail = false;
        paws = "short";
        size = 30;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public boolean isCute() {
        return cute;
    }

    public void setCute(boolean cute) {
        this.cute = cute;
    }

    public String getPaws() {
        return paws;
    }

    public void setPaws(String paws) {
        this.paws = paws;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Corgi{" +
                "tail=" + tail +
                ", cute=" + cute +
                ", paws='" + paws + '\'' +
                ", size=" + size +
                " cm}";
    }
}
