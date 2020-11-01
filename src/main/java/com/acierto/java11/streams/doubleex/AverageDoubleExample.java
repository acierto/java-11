package com.acierto.java11.streams.doubleex;

import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Movie {
    String title;
    double rating;

    Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }
}

public class AverageDoubleExample {

    public static void main(String[] args) {
        Movie m1 = new Movie("Casino", 9.5);
        Movie m2 = new Movie("Quantum", 6.5);
        Movie m3 = new Movie("Skyfall", 9.3);
        Movie m4 = new Movie("Spectre", 6.5);
        Stream<Movie> stream = Stream.of(m1, m2, m3, m4);

        ToDoubleFunction<Movie> func = Movie::getRating;
        double average = stream.collect(Collectors.averagingDouble(func));
        System.out.println(average);
    }
}
