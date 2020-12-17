package com.company.io;

import com.company.entity.Flights;
import com.company.util.DbConnectionUtil;
import com.company.util.FlightsUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FlightsDbReader {

    private  static final String SELECT_ALL = "SELECT * FROM flights";

    public List<Flights> readAll(){
        List <Flights> res = new ArrayList<>();
        Connection connection = DbConnectionUtil.detConnection();

        try (PreparedStatement statement = connection .prepareStatement(SELECT_ALL)) {

            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Flights flights = FlightsUtil.toObject(result);

                res.add(flights);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
}
