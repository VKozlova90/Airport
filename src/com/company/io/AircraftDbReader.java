package com.company.io;

import com.company.entity.Aircraft;
import com.company.util.AircraftUtil;
import com.company.util.DbConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AircraftDbReader {

    private  static final String SELECT_ALL = "SELECT * FROM aircraft";

    public List<Aircraft> readAll(){
        List <Aircraft> res = new ArrayList<>();
        Connection connection = DbConnectionUtil.detConnection();

        try (PreparedStatement statement = connection .prepareStatement(SELECT_ALL)) {

            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Aircraft aircraft = AircraftUtil.toObject(result);

                res.add(aircraft);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
}
