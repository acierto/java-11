package com.acierto.java11;

import java.util.List;

public class StreamingExamples {
    public static void main(String[] args) {
        List.of(1, 2).stream().peek(System.out::println).limit(1).count();

    }
}
