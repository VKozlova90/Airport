package com.company.util;

import com.company.entity.Flights;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FlightsUtil {

    public static Flights toObject (String line){
        String [] flightsArgs = line.split(";");

        int id = Integer.parseInt(flightsArgs[0]);
        int aircrat = Integer.parseInt(flightsArgs[1]);
        int pilot = Integer.parseInt(flightsArgs[2]);
        String data = flightsArgs[3];
        String time = flightsArgs[4];
        int flight_number = Integer.parseInt(flightsArgs[5]);

        return new Flights (id,aircrat, pilot, data, time, flight_number);

    }

    public static Flights toObject (ResultSet resultSet) throws SQLException {

        int id = resultSet.getInt("id");
        int aircrat = resultSet.getInt("aircrat");
        int pilot = resultSet.getInt("pilot");
        String data = resultSet.getString("data");
        String time = resultSet.getString("time");
        int flight_number = resultSet.getInt("flight_number");

        return new Flights(id, aircrat, pilot, data, time, flight_number);

    }

}
