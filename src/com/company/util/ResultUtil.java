package com.company.util;

import com.company.entity.Result;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultUtil {

    public static Result Object (String line){
        String [] resultArgs = line.split(";");

        int id = Integer.parseInt(resultArgs[0]);
        String flight_number = resultArgs[1];
        String data = resultArgs[2];
        String time = resultArgs[3];
        int tail_number = Integer.parseInt(resultArgs[4]);
        String brand = resultArgs[5];
        String model = resultArgs[6];
        int passenger_capacity = Integer.parseInt(resultArgs[7]);
        String last_name = resultArgs[8];
        String name = resultArgs[9];
        String pilot_code = resultArgs[10];
        String rank = resultArgs[11];

        return new Result (id, flight_number, data, time, tail_number, brand, model, passenger_capacity, last_name,
                name, pilot_code, rank);

    }

    public static Result toObject (ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("f.id");
        String flight_number = resultSet.getString("f.flight_number");
        String data = resultSet.getString("f.data");
        String time = resultSet.getString("f.time");
        int tail_number = resultSet.getInt("tail_number");
        String brand = resultSet.getString("brand");
        String model = resultSet.getString("model");
        int passenger_capacity = resultSet.getInt("passenger_capacity");
        String last_name = resultSet.getString("last_name");
        String name = resultSet.getString("name");
        String pilot_code = resultSet.getString("pilot_code");
        String rank = resultSet.getString("rank");

        return new Result (id, flight_number, data, time, tail_number, brand, model,
                passenger_capacity, last_name, name, pilot_code, rank);

    }
}

