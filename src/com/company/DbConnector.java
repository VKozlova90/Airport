package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {
    private static Connection connection;

    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/airport?useUnicode=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "Core2duo166";

    public static void main(String[] args) {

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}