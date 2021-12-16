package ru.mirea.task15;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class Task2 {
    public static void main(String[] args) {
        String path = "C:/Users/User/Desktop/task15.txt";
        File file = new File(path);

        try (FileInputStream input = new FileInputStream(file)) {
            System.out.println("\nFile has been successfully opened");
            int i=-1;
            while((i=input.read())!=-1) System.out.print((char)i);
            input.close();

            System.out.println("\nThe file has been successfully read");
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}