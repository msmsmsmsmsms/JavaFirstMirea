package ru.mirea.task2.ms;

public class book {
    private String genre;
    private int pages;
    private int price;

    public book(String g, int pa, int pr) {
        genre = g;
        pages = pa;
        price = pr;
    }

    public book(int pa, int pr) {
        genre = "Unknown";
        pages = pa;
        price = pr;
    }

    public int getPages()
    {
        return this.pages;
    }

    public int getPrice()
    {
        return this.price;
    }

    public void getGenre()
    {
        System.out.println("Book's genre is "+ this.genre);
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    public void convert() {
        float temp = this.price;
        temp = temp / 70;
        System.out.println("Price in rubles is "+this.price+", price in USD is "+ temp);
    }
}
