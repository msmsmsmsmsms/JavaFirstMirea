package ru.mirea.task12;

import java.util.Arrays;
import java.util.Comparator;

public class Test {

    public Test() {
    }

    public Student[] array = new Student[5];
    public Student[] temp_array = new Student[5];

    public void fill_array() {
        array[0] = new Student((int) (Math.random() * 50), "Bober", (int) (Math.random() * 5));
        array[1] = new Student((int) (Math.random() * 50), "Osel", (int) (Math.random() * 5));
        array[2] = new Student((int) (Math.random() * 50), "Kozel", (int) (Math.random() * 5));
        array[3] = new Student((int) (Math.random() * 50), "Baran", (int) (Math.random() * 5));
        array[4] = new Student((int) (Math.random() * 50), "Petuh", (int) (Math.random() * 5));
    }

    public void fill_temp_array() {
        array[0] = new Student((int) (Math.random() * 50), "Ovca", (int) (Math.random() * 5));
        array[1] = new Student((int) (Math.random() * 50), "Medved", (int) (Math.random() * 5));
        array[2] = new Student((int) (Math.random() * 50), "Obezyana", (int) (Math.random() * 5));
        array[3] = new Student((int) (Math.random() * 50), "Jiraf", (int) (Math.random() * 5));
        array[4] = new Student((int) (Math.random() * 50), "Koala", (int) (Math.random() * 5));
    }


    public void print_array() {
        for (int i = 0; i < 5; i++) System.out.println(array[i].toString());
        System.out.println("");
    }

    public void insert_sort_id() {
        for (int left = 0; left < array.length; left++) {
            int temp_id = array[left].id;
            String temp_name = array[left].name;
            int temp_pts = array[left].pts;
            int i = left - 1;
            for (; i >= 0; i--) {
                if (temp_id < array[i].id) {
                    array[i + 1].id = array[i].id;
                    array[i + 1].name = array[i].name;
                    array[i + 1].pts = array[i].pts;
                } else {

                    break;
                }
            }
            array[i + 1].id = temp_id;
            array[i + 1].name = temp_name;
            array[i + 1].pts = temp_pts;
        }
    }

    public void quick_sort() {
        Comparator cmpr = new SortingStudentsByGPA();
        Arrays.sort(array, cmpr);
    }



    public static void main(String[] args) {
        Test run = new Test();
        run.fill_array();
        run.print_array();
        run.insert_sort_id();
        run.print_array();
        run.quick_sort();
        run.print_array();
        run.fill_temp_array();
    }
}
