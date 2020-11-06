package com.acierto.java11.streams;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IntStreamExample {
    public static void main(String[] args) {
        IntStream is = IntStream.rangeClosed(1, 4);
        OptionalInt sum = is.reduce(Integer::sum);
        System.out.println(sum.getAsInt());

        IntStream is2 = IntStream.rangeClosed(1, 4);
        OptionalInt sum2 = is2.reduce(Integer::sum);
        System.out.println(sum2);
        System.out.println(sum2.orElse(0));
    }
}
