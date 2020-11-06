package com.acierto.java11.loops;

public class LoopExample2 {
    public static void main(String[] args) {
        System.out.println("Example 1");
        for (var i = 0; i < 10; i++) {
            System.out.print(i);
        }

        System.out.println("\nExample 2");
        for (var i = 0; i < 10; ++i) {
            System.out.print(i);
        }
    }
}
