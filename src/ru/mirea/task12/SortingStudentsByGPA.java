package ru.mirea.task12;

import java.util.Comparator;

class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getPts() - o1.getPts();
    }
}
