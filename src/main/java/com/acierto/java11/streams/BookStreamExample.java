package com.acierto.java11.streams;

import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;

class Book {
    private final String title;
    private final double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}

public class BookStreamExample {
    public static void main(String[] args) {
        var books = List.of(
                new Book("The Outsider", 2.99),
                new Book("Where the Crawdads Sing", 4.99),
                new Book("Elevation", 2.99),
                new Book("Coffin from Hong Kong", 1.99)
        );

        Stream<Book> bkStrm = books.stream();
        System.out.println(bkStrm.map(Book::getPrice).reduce(0.0, Double::sum));

        Stream<Double> doubles = Stream.of(1d, 2d, 3d);
        BinaryOperator<Double> bo = Double::sum;

        double total = doubles.reduce(0.0, bo);
    }
}
