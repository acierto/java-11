package com.acierto.java11.streams;

import java.util.stream.Stream;

class Movie {
    String title;
    double rating;

    Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }
}

public class StreamTest {

    private static void m1() {
        Movie m1 = new Movie("The Godfather", 9.5);
        Movie m2 = new Movie("The Transporter", 8.5);
        Stream.of(m1,m2)
                .peek(m -> System.out.println(m.title))
                .filter(m -> m.rating >= 9.0)
                .forEach(m -> System.out.println(m.title));
    }

    private static void m2() {
        Stream stream = Stream.builder().add("a").build();
    }

    public static void main(String[] args) {
        m1();
        m2();
    }
}
