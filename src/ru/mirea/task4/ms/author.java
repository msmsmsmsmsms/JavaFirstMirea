package ru.mirea.task4.ms;

public class author {
    private String name;
    private String email;
    private char gender;

    public author(String n, String e, char g) {
        name = n;
        email = e;
        gender = g;
    }

    public String getname()
    {
        return name;
    }

    public String getemail()
    {
        return email;
    }

    public void setemail(String email)
    {
        this.email = email;
    }

    public char getGender()
    {
        return gender;
    }

    public String toString()
    {
        return this.name + " (" + this.gender + ") at " + this.email;
    }
}
