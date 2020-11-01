package com.acierto.java11.lamdas;

import java.util.stream.Stream;

class Data {
    int number;

    public Data(int number) {
        this.number = number;
    }
}

public class ParallelReduceExample {
    static int add(int i1, int i2) {
        System.out.print(0);
        return i1 + i2;
    }

    public static void main(String[] args) {
        Data data1 = new Data(1);
        Data data2 = new Data(2);

        System.out.print("Not parallel = ");
        System.out.println(Stream.of(data1, data2)
                .reduce(0, (d1, d2) -> d1 + d2.number, ParallelReduceExample::add));

        System.out.print("Parallel = ");
        System.out.println(Stream.of(data1, data2).parallel()
                .reduce(0, (d1, d2) -> d1 + d2.number, ParallelReduceExample::add));
    }
}
