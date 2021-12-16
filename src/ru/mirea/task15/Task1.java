package ru.mirea.task15;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String path = "C:/Users/User/Desktop/task15.txt";
        File file = new File(path);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the line: ");
        String txt = in.nextLine();
        in.close();
        try (FileOutputStream output = new FileOutputStream(file)) {
            System.out.println("File has been successfully opened");
            byte[] buf = txt.getBytes();
            output.write(buf,0,buf.length);
            output.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been written");
    }
}