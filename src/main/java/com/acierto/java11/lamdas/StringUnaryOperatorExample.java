package com.acierto.java11.lamdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class StringUnaryOperatorExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        UnaryOperator<String> operator = String::toLowerCase;
        Consumer<String> consumer = System.out::print;
        list.stream().map(operator).forEach(consumer);
    }
}
