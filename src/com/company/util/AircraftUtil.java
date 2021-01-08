package com.company.util;

import com.company.entity.Aircraft;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AircraftUtil {

    public static Aircraft toObject(String line) {
        String[] aircraftArgs = line.split("; ");

        int id = Integer.parseInt(aircraftArgs[0]);
        String brand = aircraftArgs[1];
        String model = aircraftArgs[2];
        int passenger_capacity = Integer.parseInt(aircraftArgs[3]);
        int tail_number = Integer.parseInt(aircraftArgs[4]);

        return new Aircraft(id, brand, model, passenger_capacity, tail_number);
    }

    public static Aircraft toObject(ResultSet resultSet) throws SQLException {

        int id = resultSet.getInt("id");
        String brand = resultSet.getString("brand");
        String model = resultSet.getString("model");
        int passenger_capacity = resultSet.getInt("passenger_capacity");
        int tail_number = resultSet.getInt("tail_number");

        return new Aircraft(id, brand, model, passenger_capacity, tail_number);
    }
}