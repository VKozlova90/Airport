package com.company;

import db.Aircraft;
import db.Flights;
import db.Pilots;
import db.Rank;
import db.sql.AiircraftConnector;
import db.sql.FlightsConnector;
import db.sql.PilotsConnector;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {
    private static Connection connection;

    private  static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/airport?useUnicode=true&serverTimezone=UTC";
    private  static final String USER = "root";
    private  static final String PASS = "Core2duo166";


    public static void main(String[] args) {

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    PilotsConnector connector = new PilotsConnector(connection);
    Pilots pilots = new Pilots (-1, "A1", "B1", Rank.PILOT, "AB1");
    Pilots pilots1 = new Pilots (-1, "A2", "B2", Rank.TRAINEE, "AB2");
    Pilots pilots2 = new Pilots (-1, "A3", "B3", Rank.INSTRUCTOR_PILOT, "AB3");
    Pilots pilots3 = new Pilots (-1, "A4", "B4", Rank.SECOND_PILOT, "AB4");
    Pilots pilots4 = new Pilots (-1, "A5", "B5", Rank.SENIOR_PILOT, "AB5");

    try {
        FileWriter pilots = new FileWriter("pilots.csv");

        pilots.write (pilots);
        pilots.write (pilots1);
        pilots.write (pilots2);
        pilots.write (pilots3);
        pilots.write (pilots4);

        pilots.flush();

    } catch (IOException e) {
        e.printStackTrace();
    }

    FlightsConnector connector = new FlightsConnector(connection);
    Flights flights = new Flights (-1, 2, 5, "1.1.2020","1:00",1719);
    Flights flights1 = new Flights (-1, 2, 5, "2.2.2020","2:20",1719);
    Flights flights2 = new Flights (-1, 2, 5, "3.3.2020","3:30",1719);
    Flights flights3 = new Flights (-1, 2, 5, "4.5.2020","4:40",1719);
    Flights flights4 = new Flights (-1, 2, 5, "5.5.2020","5:50",1719);
    try {
        FileWriter flights = new FileWriter("flights.csv");

        flights.write (flights);
        flights.write (flights1);
        flights.write (flights2);
        flights.write (flights3);
        flights.write (flights4);

        flights.flush();

    } catch (IOException e) {
        e.printStackTrace();
    }

    AiircraftConnector connector = new AiircraftConnector(connection);
    Aircraft aircraft = new Aircraft(-1, "BR1", "MOD1", 89, 1212);
    Aircraft aircraft1 = new Aircraft (-1, "BR2", "MOD2", 125, 1313);
    Aircraft aircraft2 = new Aircraft (-1, "BR3", "MOD3", 8, 1414);
    Aircraft aircraft3 = new Aircraft (-1, "BR4", "MOD4", 277, 1515);
    Aircraft aircraft4 = new Aircraft (-1, "BR5", "MOD5", 159, 1616);
    try {
        FileWriter aircraft = new FileWriter("aircraft.csv");

        aircraft.write (aircraft);
        aircraft.write (aircraft1);
        aircraft.write (aircraft2);
        aircraft.write (aircraft3);
        aircraft.write (aircraft4);

        aircraft.flush();

    } catch (IOException e) {
        e.printStackTrace();
    }










}
