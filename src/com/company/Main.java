package com.company;

import com.company.entity.Pilots;
import com.company.io.PilotsReader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

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

        PilotsReader reader = new PilotsReader ("sourse_data\\pilots.csv");

        for (Pilots pilots : reader.readItens()){
            System.out.println(pilots);
        }













    }

}
