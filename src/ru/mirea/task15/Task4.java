package ru.mirea.task15;


import java.io.*;
import java.util.Scanner;

class Task4 {
    public static void main(String[] args) {
        String path = "C:/Users/User/Desktop/task15.txt";
        File file = new File(path);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the line to append: ");
        String txt = in.nextLine();

        try {
            FileWriter fw = new FileWriter(path,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw);
            System.out.println("File has been successfully opened");

            out.println(txt);
            out.close();

            System.out.println("The text has been successfully appended");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
