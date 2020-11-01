package com.acierto.java11.locale;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatExample {
    public static void main(String[] args) {
        Locale locale = new Locale("fr");
        NumberFormat nf = NumberFormat.getNumberInstance(locale);
        DecimalFormat df = (DecimalFormat) nf;

        df.applyPattern("##.00");
        double number = 1.2;
        String output = df.format(number);
        System.out.println("=" + output + "=");
    }
}
