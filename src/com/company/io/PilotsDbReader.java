package com.company.io;

import com.company.entity.Pilots;
import com.company.util.DbConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PilotsDbReader {
  private  static final String SELECT_ALL = "SELECT * FROM pilots";

    public List<Pilots> readAll(){
        List <Pilots> res = new ArrayList<>();
        Connection connection = DbConnectionUtil.detConnection();

        try (PreparedStatement statement = connection .prepareStatement(SELECT_ALL)) {

            ResultSet result = statement.executeQuery();
            while (result.next()) {

                int id = result.getInt("id");
                String name = result.getString("name");
                String last_name = result.getString("last_name");
                String rank = result.getString("rank");
                String pilot_code = result.getString("pilot_code");

                Pilots pilots = new Pilots(id, name, last_name, rank, pilot_code);

                res.add(pilots);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }



}
