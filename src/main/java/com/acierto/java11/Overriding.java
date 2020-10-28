package com.acierto.java11;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class A {
    public List<String> getValues(Set<CharSequence> input) {
        return null;
    }
}

class B extends A {
    public List<String> getValues(Set<CharSequence> input) {
        return null;
    }

    public List<String> getValues(TreeSet<String> input) {
        return null;
    }
}

public class Overriding {
}
