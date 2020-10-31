package com.acierto.java11.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        List<? super Number> l = new ArrayList<>();
        l.add(1L);
        l.add(2D);
        System.out.println(l);
    }
}
