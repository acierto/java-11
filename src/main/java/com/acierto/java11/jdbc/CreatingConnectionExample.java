package com.acierto.java11.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class CreatingConnectionExample {
    public static void main(String[] args) throws SQLException {
        Connection connection1 = DriverManager.getConnection("url");

        Connection connection2 = DriverManager.getConnection("url", "user", "password");

        Properties info = new Properties();
        info.setProperty("user", "user");
        info.setProperty("password", "password");
        Connection connection3 = DriverManager.getConnection("url", info);
    }
}
