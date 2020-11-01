package com.acierto.java11.enums;


enum Data {
    INTERNAL(2) {
        int extract() {
            return ++number;
        }
    };

    int number;

    Data(int number) {
        this.number = number;
    }

    int extract() {
        return 0;
    }
}

public class EnumData {
    public static void main(String[] args) {
        System.out.println(Data.INTERNAL.extract());
    }
}
