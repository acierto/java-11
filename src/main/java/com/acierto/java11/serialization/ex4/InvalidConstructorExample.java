package com.acierto.java11.serialization.ex4;

import java.io.*;

class Person {
    protected String name;

    protected Person(String name) {
        this.name = name;
    }
}

class Member extends Person implements Serializable {
    public int id;

    public Member(String name, int id) {
        super(name);
        this.id = id;
    }
}

public class InvalidConstructorExample {
    public static void main(String[] args) throws Exception {
        File file = new File("/tmp/o.ser");
        Member member = new Member("John", 1);
        var oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(member);

        var ois = new ObjectInputStream(new FileInputStream(file));
        Person person = (Person) ois.readObject();
        System.out.println(person.name);
    }
}
