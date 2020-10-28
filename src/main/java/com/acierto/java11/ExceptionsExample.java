package com.acierto.java11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsExample {

    public void something() {
        try(var f = new FileInputStream("myfile")) {

        } catch (IOException e) {

        }
    }
}
