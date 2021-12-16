package ru.mirea.task15;

import java.io.*;
import java.util.Scanner;

class Task3 {
    public static void main(String[] args) {
        String path = "C:/Users/User/Desktop/task15.txt";
        File file = new File(path);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the line: ");
        String txt = in.nextLine();

        try {
            System.out.println("File has been successfully opened");
            FileWriter fstream1 = new FileWriter(path);
            BufferedWriter out1 = new BufferedWriter(fstream1);
            out1.write("");
            out1.close();

            FileOutputStream output = new FileOutputStream(file);
            byte[] buf = txt.getBytes();
            output.write(buf,0,buf.length);
            output.close();
            System.out.println("The file has been successfully rewritten");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}