//package com.company;
//
//import db.sql.AiircraftConnector;
//import db.sql.FlightsConnector;
//import db.sql.PilotsConnector;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class DbConnector {
//    private static Connection connection;
//
//    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/airport?useUnicode=true&serverTimezone=UTC";
//    private static final String USER = "root";
//    private static final String PASS = "Core2duo166";
//
//    public static void main(String[] args) {
//
//        Connection connection = null;
//        try {
//            connection = DriverManager.getConnection(DB_URL, USER, PASS);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

//        List<Pilots> pilots= new ArrayList<>();
//
//        pilots.add (new Pilots(-1, "A1", "B1", Rank.PILOT, "AB1"));
//        pilots.add (new Pilots(-1, "A2", "B2", Rank.TRAINEE, "AB2"));
//        pilots.add (new Pilots(-1, "A3", "B3", Rank.INSTRUCTOR_PILOT, "AB3"));
//        pilots.add (new Pilots(-1, "A4", "B4", Rank.SECOND_PILOT, "AB4"));
//        pilots.add (new Pilots(-1, "A5", "B5", Rank.SENIOR_PILOT, "AB5"));

        System.out.println(pilots);
        PilotsOUtil.writePilots(List<Pilots> pilots, "pilots.csv");
        PilotsOUtil.readPilots("pilots.csv");

        PilotsConnector connector = new PilotsConnector(connection);
        System.out.println("Старт записи в таблицу pilots");
        connector.add(List<Pilots> pilots);

        System.out.println("Запись в таблицу pilots завершена");

        for (Pilots p: connector.readAll()){
            System.out.println(p);
        }


//        List<Aircraft> aircraft= new ArrayList<>();
//        aircraft.add(new Aircraft(-1, "BR1", "MOD1", 89, 1212));
//        aircraft.add(new Aircraft(-1, "BR2", "MOD2", 125, 1313));
//        aircraft.add(new Aircraft(-1, "BR3", "MOD3", 8, 1414));
//        aircraft.add(new Aircraft(-1, "BR4", "MOD4", 277, 1515));
//        aircraft.add(new Aircraft(-1, "BR5", "MOD5", 159, 1616));

        System.out.println(aircraft);
        AircraftOUtil.writeAircraft(List<Aircraft> aircraft, "aircraft.csv");
        AircraftOUtil.readAircraft("aircraft.csv");

        AiircraftConnector connector = new  AiircraftConnector(connection);
        System.out.println("Старт записи в таблицу aircraft");

        connector.add(List<Aircraft> aircraft);

        System.out.println("Запись в таблицу aircraft завершена");
        for (Aircraft a: connector.readAll()){
            System.out.println(a);
        }


//        List<Flights> flights= new ArrayList<>();
//        flights.add (new Flights(-1, 2, 5, "1.1.2020", "1:00", 1719));
//        flights.add (new Flights(-1, 2, 5, "2.2.2020", "2:20", 1719));
//        flights.add (new Flights(-1, 2, 5, "3.3.2020", "3:30", 1719));
//        flights.add (new Flights(-1, 2, 5, "4.5.2020", "4:40", 1719));
//        flights.add (new Flights(-1, 2, 5, "5.5.2020", "5:50", 1719));

        System.out.println(flights);
        FlightsOUtil.writeFlights(List<Flights> flights, "flights.csv");
        FlightsOUtil.readFlights("flights.csv");

        FlightsConnector connector = new  FlightsConnector(connection);
        System.out.println("Старт записи в таблицу flights");
        connector.add(List<Flights> flights);

        System.out.println("Запись в таблицу flights завершена");

        for (Flights f: connector.readAll()){
            System.out.println(f);
        }




    }
}