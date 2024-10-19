package by.itacademy.polnaerdman;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        list.add(new Book("1", "War and Peace. Volume 1", "Lev Tolstoy", "Eksmo", 2020, "448", "468 RUB", "Hard"));
        list.add(new Book("2", "1984", "George Orwell", "NewEksmo", 2022, "384", "1508 RUB", "Hard"));
        printBooksByAurthor(list, "George Orwell");
        printBooksByPublisher(list, "Eksmo");
        printBooksAfterYear(list, 2021);
    }

    private static void printBooksByAurthor (ArrayList<Book> list, String author) {
        System.out.println("Books with author " + author);
        for(int i = 0; i < list.size(); i++) {
            Book book = list.get(i);
            if (book.getAuthors() == author)
                System.out.println(book);
        }
    }

    private static void printBooksByPublisher (ArrayList<Book> list, String publisher) {
        System.out.println("Books with publisher " + publisher);
        for(int i = 0; i < list.size(); i++) {
            Book book = list.get(i);
            if (book.getPublisher() == publisher)
                System.out.println(book);
        }
    }

    private static void printBooksAfterYear (ArrayList<Book> list, int startYear) {
        System.out.println("Books published after " + startYear);
        for(int i = 0; i < list.size(); i++) {
            Book book = list.get(i);
            if (book.getYear() >= startYear)
                System.out.println(book);
        }
    }
}
