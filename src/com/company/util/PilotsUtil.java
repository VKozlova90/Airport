package com.company.util;

import com.company.entity.Pilots;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PilotsUtil {

    public static Pilots toObject (String line){
        String [] pilotsArgs = line.split(";");

        int id = Integer.parseInt(pilotsArgs[0]);
        String name = pilotsArgs[1];
        String last_name = pilotsArgs[2];
        String rank = pilotsArgs[3];
        String pilot_code = pilotsArgs[4];

       return new Pilots(id, name, last_name, rank, pilot_code);

    }

    public static Pilots toObject (ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        String last_name = resultSet.getString("last_name");
        String rank = resultSet.getString("rank");
        String pilot_code = resultSet.getString("pilot_code");

        return new Pilots(id, name, last_name, rank, pilot_code);

    }
}
