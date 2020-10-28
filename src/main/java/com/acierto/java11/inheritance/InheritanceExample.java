package com.acierto.java11.inheritance;

interface A {
    void m();
}

interface B {
    default void m() {
        System.out.println("B");
    }
}

abstract class C implements A, B {
    @Override // Without it, it will not compile
    public void m() {

    }
}

public class InheritanceExample {
}
