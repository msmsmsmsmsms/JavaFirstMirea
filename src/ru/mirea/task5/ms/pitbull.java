package ru.mirea.task5.ms;

public class pitbull extends Dog {
    public pitbull(){
        cute = true;
        tail = true;
        paws = "medium";
        size = 50;
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
        return "Pitbull{" +
                "tail=" + tail +
                ", cute=" + cute +
                ", paws='" + paws + '\'' +
                ", size=" + size +
                " cm}";
    }
}

