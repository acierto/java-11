package com.acierto.java11.lamdas;

import java.util.List;

class Book {
    private final String title;
    private final String genre;

    Book(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    String getTitle() {
        return title;
    }

    String getGenre() {
        return genre;
    }
}

interface Reader {
    void read(Book b);
}

public class LambdaReaderExample {
    public static void main(String[] args) {
        List<Book> books = List.of(
                new Book("Gone with the wind", "Fiction"),
                new Book("Bourne Ultimatum", "Thriller"),
                new Book("The client", "Thriller")
        );

        Reader r = b ->
                System.out.println("Reading book " + b.getTitle());
        books.forEach(r::read);
    }
}
