package com.acierto.java11.serialization.ex3;

import java.io.*;


class A {
    int i;
}

class B extends A implements Serializable {
    int j;
}

class C extends B {
    int k;
}

public class Serialization3 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filename = "/tmp/test.ser";
        C input = new C();
        input.i = 1;
        input.j = 2;
        input.k = 3;

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            oos.writeObject(input);
            C output = (C) ois.readObject();
            System.out.println(output.i + " " + output.j + " " + output.k);

        }
    }
}
