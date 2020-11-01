package com.acierto.java11.inheritance;

interface Foo {
    default void m1() {
        m2();
    }

    private void m2() {
        System.out.println("Foo");
    }
}

public class InheritanceFoo implements Foo {
    public void m2() {
        System.out.println("Test");
    }

    public static void main(String[] args) {
        Foo foo = new InheritanceFoo();
        foo.m1();
    }
}
