package ru.mirea.task3.ms;

public class Human {
    public String name;
    public Head head;
    public Leg leg;
    public Hand hand;
    public Human(String n){
        name = n;
        head = new Head(10);
        leg = new Leg(8);
        hand = new Hand(3);
    }

    public static void main(String[] args) {

        Human hum1 = new Human("Maxon");
        System.out.println(hum1.name + " has:");

        if (hum1.head.intelligence <= 50) System.out.println("Low intelligence");
        else if (hum1.head.intelligence >= 51 && hum1.head.intelligence <= 100) System.out.println("Normal intelligence");
        else System.out.println("Huge intelligence");


        if (hum1.hand.hand_power <= 5) System.out.println("Weak hands");
        else if (hum1.hand.hand_power >= 6 && hum1.hand.hand_power <= 10) System.out.println("Normal hands");
        else System.out.println("Strong hands");


        if (hum1.leg.size < 7) System.out.println("Small feet");
        else if (hum1.leg.size >= 7 && hum1.leg.size <=11) System.out.println("Normal feet");
        else System.out.println("Big feet");

        System.out.println(hum1.name + "'s stats:");
        System.out.println(" Intelligence stats = " + hum1.head.intelligence);
        System.out.println(" Hand power stats = " + hum1.hand.hand_power);
        System.out.println(" Feet size stats = " + hum1.leg.size );
    }
}
