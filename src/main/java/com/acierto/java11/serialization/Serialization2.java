package com.acierto.java11.serialization;


import java.io.*;

class Student {
    private int age;
    private transient String address;

    public Student() {
        age = 20;
    }

    public Student(int age, String address) {
        this.age = age;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class Clazz extends Student implements Serializable {
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return gender + " " + getAddress() + " " + getAge();
    }
}

public class Serialization2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Clazz clazz = new Clazz();
        clazz.setGender("m");
        clazz.setAge(10);
        clazz.setAddress("Haarlem");

        File file = new File("/tmp/o.ser");
        var oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(clazz);

        var ois = new ObjectInputStream(new FileInputStream(file));
        Clazz c = (Clazz) ois.readObject();
        System.out.println(c);
    }
}
