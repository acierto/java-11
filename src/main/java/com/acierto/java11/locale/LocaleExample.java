package com.acierto.java11.locale;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleExample {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Locale locale = new Locale("fr", "CA");
        ResourceBundle bundle = ResourceBundle.getBundle("MyResource", locale);
        System.out.println(bundle.getString("greeting"));
    }
}
