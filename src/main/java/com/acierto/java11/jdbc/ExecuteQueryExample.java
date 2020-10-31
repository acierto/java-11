package com.acierto.java11.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteQueryExample {

    void handleResult(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM PEOPLE");
            while (resultSet.next()) {
                //...
            }
        }
    }
}
