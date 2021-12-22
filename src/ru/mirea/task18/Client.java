package ru.mirea.task18;

public class Client
{
    String Name;
    String INN;

    Client(String fullName, String INN)
    {
        this.Name = fullName;
        this.INN = INN;
    }

    String getFullName() { return Name; }
    String  getINN() { return INN; }
}