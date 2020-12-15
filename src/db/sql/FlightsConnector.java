package db.sql;

import db.Flights;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FlightsConnector {
    private Connection connection;

    public FlightsConnector(Connection connection) {
        this.connection = connection;
    }

    private static final String ADD = "INSERT INTO flights (aircraft, pilot, data, time, flight_number) VALUES (?, ?, ?, ?, ?)";

    public void add (Flights flights) {
        try (PreparedStatement statement = connection.prepareStatement(ADD)){
            statement.setInt(1, flights.getAircrat());
            statement.setInt(2, flights.getPilot());
            statement.setDate(3, flights.getData());
            statement.setTime(4, flights.getTime());

            int resFlights = statement.executeUpdate();

            System.out.println(resFlights);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
