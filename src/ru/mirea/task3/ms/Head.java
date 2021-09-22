package ru.mirea.task3.ms;

public class Head {
    public int intelligence;    //0-50 - stupid, 51-100 - normal, 100+ - smart

    public Head(int i){
        intelligence = i;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getIntelligence() {
        return this.intelligence;
    }

}
