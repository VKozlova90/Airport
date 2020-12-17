package com.company.io;

import com.company.entity.Flights;
import com.company.util.DbConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class FlightsDbWriter {

    private List<Flights> flights;
    private static final String ADD = "INSERT INTO flights (id, aircraft, pilot, data, time, flight_number) VALUES (?, ?, ?, ?, ?, ?)";

    public FlightsDbWriter(List<Flights> flights) {
        this.flights = flights;
    }

    public void saveAll(){
        for (Flights flights :flights){
            save(flights);
        }
    }

    private void save(Flights flights){
        Connection connection = DbConnectionUtil.detConnection();

        try (PreparedStatement statement = connection.prepareStatement(ADD)){
            statement.setInt(1, flights.getId());
            statement.setInt(2, flights.getAircrat());
            statement.setInt(3, flights.getPilot());
            statement.setString(4, flights.getData());
            statement.setString(5, flights.getTime());
            statement.setInt(6, flights.getFlight_number());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
