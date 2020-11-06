package com.acierto.java11.collections;

import java.util.Arrays;
import java.util.List;

public class ListRemoveIfExample {
    public static void main(String[] args) {
        String[] elements = new String[] {"1", "2", "3"};
        List<String> list = Arrays.asList(elements);
        for (String element: list) {
            list.removeIf(e -> Integer.parseInt(e) % 2 == 0);
        }
        System.out.println(list);
    }
}
