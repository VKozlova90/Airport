package com.company.io;

import com.company.entity.Result;
import com.company.util.DbConnectionUtil;
import com.company.util.ResultUtil;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FullInfoDbReader {

    private static final String SELECT_ALL = "SELECT f.id, f.flight_number, f.data, f.time FROM flights AS f INNER JOIN aircraft a ON a.id=f.aircraft INNER JOIN pilots p ON p.id=f.pilot";

    public void readAll() {
        Connection connection = DbConnectionUtil.detConnection();

        try (PreparedStatement statement = connection.prepareStatement(SELECT_ALL)) {

            ResultSet result = statement.executeQuery();

            while (result.next()) {
                int id = result.getInt("f.id");
                String flight_number = result.getString("f.flight_number");
                String data = result.getString("f.data");
                String time = result.getString("f.time");
                int tail_number = result.getInt("tail_number");
                String brand = result.getString("brand");
                String model = result.getString("model");
                int passenger_capacity = result.getInt("passenger_capacity");
                String last_name = result.getString("last_name");
                String name = result.getString("name");
                String pilot_code = result.getString("pilot_code");
                String rank = result.getString("rank");

                System.out.println(id + "-" + flight_number + "-" + data + "-" + time + "-" + tail_number + "-" + brand
                        + " " + model + "-" + passenger_capacity + "-" + last_name + " " + name + "-" + pilot_code
                        + "-" + rank);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

        public void writeResult(){
        Connection connection = DbConnectionUtil.detConnection();

        try (FileWriter writer= new FileWriter("result\\result.csv")){

            for (Result result : result){
                String line = ResultUtil.Object(result);
                writer.write(line);
            }
       } catch (IOException e) {
            e.printStackTrace();
        }

}

