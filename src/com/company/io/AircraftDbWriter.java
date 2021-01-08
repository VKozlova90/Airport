package com.company.io;

import com.company.entity.Aircraft;
import com.company.util.DbConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class AircraftDbWriter {

    private List<Aircraft> aircraft;
    private static final String ADD = "INSERT INTO aircraft (brand, model, passenger_capacity, tail_number) VALUES (?, ?, ?, ?)";

    public AircraftDbWriter(List<Aircraft> aircraft) {
        this.aircraft = aircraft;
    }

    public void saveAll() {
        for (Aircraft aircraft : aircraft) {
            System.out.println(aircraft);
            save(aircraft);
        }
    }

    private void save(Aircraft aircraft) {
        Connection connection = DbConnectionUtil.detConnection();

        try (PreparedStatement statement = connection.prepareStatement(ADD)) {
            statement.setString(1, aircraft.getBrand());
            statement.setString(2, aircraft.getModel());
            statement.setInt(3, aircraft.getPassenger_capacity());
            statement.setInt(4, aircraft.getTail_number());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
