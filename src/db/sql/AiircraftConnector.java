package db.sql;

import db.Aircraft;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AiircraftConnector {
    private Connection connection;

    public AiircraftConnector(Connection connection) {
        this.connection = connection;
    }

    private static final String ADD = "INSERT INTO aircraft (brand, model, passenger_capacity, tail_number) VALUES (?, ?, ?, ?)";

    public void add (Aircraft aircraft) {
        try (PreparedStatement statement = connection.prepareStatement(ADD)){
            statement.setString(1, aircraft.getBrand());
            statement.setString(2, aircraft.getModel());
            statement.setInt(3, aircraft.getPassenger_capacity());
            statement.setInt(4, aircraft.getTail_number());

            int resAircraft = statement.executeUpdate();

            System.out.println(resAircraft);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
