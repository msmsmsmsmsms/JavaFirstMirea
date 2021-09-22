package ru.mirea.task3.ms;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setGenre("Sci-fi");
        book1.setAuthor("Carl Marx");
        book1.setPages(333);
        book1.setPrice("41$");
        book1.setYear(1899);

        System.out.println(book1.toString());
    }
}
