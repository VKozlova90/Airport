package db.sql;

import com.company.entity.Aircraft;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AiircraftConnector {
    private Connection connection;

    public AiircraftConnector(Connection connection) {
        this.connection = connection;
    }

    private static final String ADD = "INSERT INTO aircraft (brand, model, passenger_capacity, tail_number) VALUES (?, ?, ?, ?)";
    private  static final String REQUEST = "SELECT * FROM aircraft";

    public void add (Aircraft aircraft) {
        try (PreparedStatement statement = connection.prepareStatement(ADD)){
            statement.setString(1, aircraft.getBrand());
            statement.setString(2, aircraft.getModel());
            statement.setInt(3, aircraft.getPassenger_capacity());
            statement.setInt(4, aircraft.getTail_number());

            int resAircraft = statement.executeUpdate();

            System.out.println(resAircraft);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<Aircraft> readAll(){
        List <Aircraft> res = new ArrayList<>();

        try (PreparedStatement statement = connection.prepareStatement(REQUEST)) {

            ResultSet result = statement.executeQuery();
            while (result.next()) {

                int id = result.getInt("id");
                String brand = result.getString("brand");
                String model = result.getString("model");
                int passenger_capacity = result.getInt("passenger_capacity");
                int tail_number = result.getInt("tail_number");

                Aircraft a = new Aircraft(id, brand, model, passenger_capacity, tail_number);

                res.add(a);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
}
