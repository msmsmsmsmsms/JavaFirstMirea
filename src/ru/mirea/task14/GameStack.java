package ru.mirea.task14;

import java.util.*;

public class GameStack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> fPlayer = new Stack<>();
        Stack<Integer> sPlayer = new Stack<>();
        int []a= new int[5];
        System.out.println("Введите карты первого игрока: ");
        for(int i=0;i<5;i++)
            a[i]=in.nextInt();
        for(int i=4;i>=0;i--)
            fPlayer.push(a[i]);
        System.out.println("Введите карты второго игрока: ");
        for(int i=0;i<5;i++)
            a[i]=in.nextInt();
        for(int i=4;i>=0;i--)
            sPlayer.push(a[i]);
        int count =0;
        while(!fPlayer.empty() && !sPlayer.empty()) {
            if (fPlayer.peek() == 0 && sPlayer.peek() == 9) {
                fPlayer.add(0, fPlayer.pop());
                fPlayer.add(0, sPlayer.pop());
                count++;
            }
            else if(fPlayer.peek() == 9 && sPlayer.peek()==0){
                sPlayer.add(0,fPlayer.pop());
                sPlayer.add(0,sPlayer.pop());
                count++;
            }
            else if(fPlayer.peek()>sPlayer.peek()){
                fPlayer.add(0, fPlayer.pop());
                fPlayer.add(0, sPlayer.pop());
                count++;
            }
            else if(fPlayer.peek()<sPlayer.peek()){
                sPlayer.add(0,fPlayer.pop());
                sPlayer.add(0,sPlayer.pop());
                count++;
            }
            if(count==106)
                break;
        }
        if (count ==106)
            System.out.println("botva");
        else if(fPlayer.empty())
            System.out.println("second " + count);
        else
            System.out.println("first " + count);
    }
}