package ru.mirea.task3.ms;

public class Hand {
    public int hand_power;  //0-5 weak 6-10 normal, 10+ strong

    public Hand(int hp){
        hand_power = hp;
    }

    public int getHand_power() {
        return this.hand_power;
    }

    public void setHand_power(int hand_power) {
        this.hand_power = hand_power;
    }
}
