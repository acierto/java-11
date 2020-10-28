package com.acierto.java11.serialization;

import java.io.Serializable;

class Address {
    private String street;
    transient private String house;

    public Address(String street, String house) {
        this.street = street;
        this.house = house;
    }
}

class Person extends Address implements Serializable {

    public Person(String street, String house) {
        super(street, house);
    }
}

public class SerializationExample {
}
