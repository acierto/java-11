package com.acierto.java11.lamdas;

import java.util.function.Function;

public class LamdasExample {
    public static void main(String[] args) {
        Function<Integer, Double> f1 = i -> (double) (i+2);
        Function<Integer, Integer> f2 = d -> (int) (d*3);
        Function<Integer, Double> f3 = f2.andThen(f1);
        System.out.println(f2.apply(1));
    }
}
