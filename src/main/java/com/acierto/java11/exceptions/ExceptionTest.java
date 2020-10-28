package com.acierto.java11.exceptions;

import java.io.IOException;

class MyResource implements AutoCloseable {

    public void open() throws IOException {
        throw new IOException("open");
    }

    @Override
    public void close() throws Exception {
        throw new ArithmeticException("close");
    }
}

public class ExceptionTest {
    public static void main(String[] args) throws Exception {
        try(MyResource myResource = new MyResource()) {
            myResource.open();
            throw new NullPointerException("try");
        }
    }
}
