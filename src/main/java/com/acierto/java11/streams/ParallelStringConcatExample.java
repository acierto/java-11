package com.acierto.java11.streams;

import java.util.List;

public class ParallelStringConcatExample {
    public static void main(String[] args) {
        String result = List.of("a", "b")
                .parallelStream()
                .collect(String::new, String::concat, String::concat);
        System.out.println(result);
    }
}
