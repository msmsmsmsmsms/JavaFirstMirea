package ru.mirea.task12;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    public int compare(Student _1, Student _2) {
        return -(_1.getScore() - _2.getScore());
    }
}