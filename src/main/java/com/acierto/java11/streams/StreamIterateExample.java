package com.acierto.java11.streams;

import java.util.stream.Stream;

public class StreamIterateExample {
    public static void main(String[] args) {
        Stream.iterate(0, i -> i < 5, i -> i + 1)
                .filter(i -> i % 2 == 0)
                .filter(i -> i % 3 == 0)
                .forEach(System.out::print);
    }
}
