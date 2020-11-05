package com.acierto.java11.strings;

public class StringsExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a").append("b").append("c");
        System.out.println(sb.reverse());

        String str1 = "string";
        System.out.println(str1.repeat(3));
    }
}
