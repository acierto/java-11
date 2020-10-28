package com.acierto.java11;

import java.util.function.Predicate;

class Foo {
    int i;

    public Foo(int i) {
        this.i = i;
    }
}

public class PredicateExample {
    static boolean compare(Foo foo, Predicate predicate) {
        return predicate.test(foo);
    }

    public static void main(String[] args) {
        Predicate<Foo> p = f -> f.i > 0;
        p = p.or(f -> f.i > 0).and(f -> f.i < 0);
        boolean b = compare(new Foo(1), p);
        System.out.println(b);
    }
}
