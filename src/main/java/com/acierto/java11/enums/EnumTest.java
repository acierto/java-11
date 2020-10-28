package com.acierto.java11.enums;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

enum MyEnum {
    A(40), B(20), C(30);

    final private int weight;

    MyEnum(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}

public class EnumTest {
    public static void main(String[] args) {
        Set<MyEnum> elements = new TreeSet<>(List.of(MyEnum.C, MyEnum.A, MyEnum.B));
        System.out.println(elements);

        Set<Integer> integers = new TreeSet<>(List.of(3,1,4));
        System.out.println(integers);
    }
}
