package ru.mirea.task12;

public class Student {
    public int id;
    public String name;
    public int pts;


    public Student(){}
    public Student(int id, String name, int pts) {
        this.id = id;
        this.name = name;
        this.pts = pts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPts() {
        return pts;
    }

    public void setPts(int pts) {
        this.pts = pts;
    }

    @Override
    public String toString() {
        return "Student: " +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", pts = " + pts;
    }
}
