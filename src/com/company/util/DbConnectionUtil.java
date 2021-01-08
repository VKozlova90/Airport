package com.company.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionUtil {
    private static Connection connection;
    private static final String DB_URL = "jdbc:mysql://localhost:3306/airport?useUnicode=true&useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "1ivjwBvp%";

    public static Connection detConnection() {


        if (connection == null) {

            try {
                connection = DriverManager.getConnection(DB_URL, USER, PASS);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}