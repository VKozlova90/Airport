package db.sql;

import db.Pilots;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PilotsConnector {
    private Connection connection;

    public PilotsConnector(Connection connection) {
        this.connection = connection;
    }

    private static final String ADD = "INSERT INTO pilots (name, last_name, rank, pilot_code) VALUES (?, ?, ?, ?)";

    public void add (Pilots pilots) {
        try (PreparedStatement statement = connection.prepareStatement(ADD)){
            statement.setString(1, pilots.getName());
            statement.setString(2, pilots.getLast_name());
            statement.setString(3, pilots.getRank());
            statement.setString(4, pilots.getPilot_code());

            int resPilots = statement.executeUpdate();

            System.out.println(resPilots);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
