package com.acierto.java11.numberformat;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatExample {
    public static void main(String[] args) throws ParseException {
        Locale locale1 = Locale.FRANCE;
        NumberFormat formatter1 = NumberFormat.getNumberInstance(locale1);
        double d1 = 1234.5;
        String formatted = formatter1.format(d1);

        Locale locale2 = Locale.UK;
        NumberFormat formatter2 = NumberFormat.getNumberInstance(locale2);
        Number d2 = formatter2.parse(formatted); // returns Number!!!
        System.out.println(d2);
    }
}
