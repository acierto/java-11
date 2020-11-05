package com.acierto.java11.streams;

import java.util.function.UnaryOperator;

public class ApplyUnaryOperatorsExample {
    public static void main(String[] args) {
        String val1 = "hello";
        String val2 = "world";
        UnaryOperator<String> uo1 = s1 -> s1.concat(val1);
        UnaryOperator<String> uo2 = String::toUpperCase;
        System.out.println(uo1.apply(uo2.apply(val2)));
    }
}
