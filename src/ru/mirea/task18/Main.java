package ru.mirea.task18;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        Client[] clients = new Client[]
                {
                        new Client("Шувалов Матвей", "111"),
                        new Client("Петр Андросов", "222"),
                        new Client("Павел Раужев", "333"),
                        new Client("Стас Веселов", "444"),
                };

        System.out.print("Введите имя: ");
        String input = new Scanner(System.in).nextLine();
        boolean contains = false;
        int clientNumber = 0;
        for (int i = 0; i < clients.length; ++i)
            if (clients[i].getFullName().equals(input))
            {
                contains = true;
                clientNumber = i;
                break;
            }

        try
        {
            if (contains) {
                System.out.print("Введите ИНН: ");
                input = new Scanner(System.in).nextLine();
                if (clients[clientNumber].getINN().equals(input))
                    System.out.println("Верный ИНН");
                else throw new Exception("Неверный ИНН");
            } else throw new Exception("Имени " + input + " нет в списке");
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
