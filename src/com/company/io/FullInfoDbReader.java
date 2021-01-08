package com.company.io;

import com.company.entity.Rank;
import com.company.entity.Result;
import com.company.util.DbConnectionUtil;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FullInfoDbReader {
    private List<Result> resultList = new ArrayList<>();

    private static final String SELECT_ALL = "SELECT f.flight_number, f.data, f.time, a.tail_number, a.brand, a.model,"
            + " a.passenger_capacity, p.last_name, p.name, p.pilot_code, p.p_rank FROM flights f JOIN aircraft a ON f.aircrat=a.id JOIN pilots p ON f.pilot = p.id";

    public void readAll() {
        Connection connection = DbConnectionUtil.detConnection();

        try (PreparedStatement statement = connection.prepareStatement(SELECT_ALL)) {

            ResultSet result = statement.executeQuery();

            while (result.next()) {
                String flight_number = result.getString("f.flight_number");
                String data = result.getString("f.data");
                String time = result.getString("f.time");
                int tail_number = result.getInt("a.tail_number");
                String brand = result.getString("a.brand");
                String model = result.getString("a.model");
                int passenger_capacity = result.getInt("a.passenger_capacity");
                String last_name = result.getString("p.last_name");
                String name = result.getString("p.name");
                String pilot_code = result.getString("p.pilot_code");
                Rank rank = Rank.valueOf(result.getString("p.p_rank"));

                Result res = new Result(flight_number, data, time, tail_number, brand, model, passenger_capacity, last_name, name, pilot_code, rank);
                resultList.add(res);

                System.out.println(flight_number + ", " + data + ", " + time + ", " + tail_number + ", " + brand + " "
                + model + ", " + passenger_capacity + ", " + last_name + " " + name + ", " + pilot_code + " (" + rank + ")");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




    public void writeResult() {
        try (FileWriter writer = new FileWriter("result\\result.csv")) {

            for (Result result : resultList) {
                writer.append(result.getFlight_number()).append(", ");
                writer.append(result.getData()).append(", ");
                writer.append(result.getTime()).append(", ");
                writer.append(String.valueOf(result.getTail_number())).append(", ");
                writer.append(result.getBrand()).append(", ");
                writer.append(result.getModel()).append(", ");
                writer.append(String.valueOf(result.getPassenger_capacity())).append(", ");
                writer.append(result.getLast_name()).append(", ");
                writer.append(result.getName()).append(", ");
                writer.append(result.getPilot_code()).append(", ");
                writer.append(result.getRank().toString());
                writer.append("\n");
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
