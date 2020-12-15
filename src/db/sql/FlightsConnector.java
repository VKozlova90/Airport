package db.sql;

import db.Aircraft;
import db.Flights;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlightsConnector {
    private Connection connection;

    public FlightsConnector(Connection connection) {
        this.connection = connection;
    }

    private static final String ADD = "INSERT INTO flights (aircraft, pilot, data, time, flight_number) VALUES (?, ?, ?, ?, ?)";
    private  static final String REQUEST = "SELECT * FROM flights";

    public void add (Flights flights) {
        try (PreparedStatement statement = connection.prepareStatement(ADD)){
            statement.setInt(1, flights.getAircrat());
            statement.setInt(2, flights.getPilot());
            statement.setDate(3, flights.getData());
            statement.setTime(4, flights.getTime());

            int resFlights = statement.executeUpdate();

            System.out.println(resFlights);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Flights> readAll(){
        List <Flights> res = new ArrayList<>();

        try (PreparedStatement statement = connection.prepareStatement(REQUEST)) {

            ResultSet result = statement.executeQuery();
            while (result.next()) {


                private Date data;
                private Time time;
                private int flight_number;

                int id = result.getInt("id");
                int aircrat = result.getInt("aircrat");
                int pilot = result.getInt("pilot");
                String data = result.getString("data");
                String time = result.getString("time");
                int flight_number = result.getInt("flight_number");

                Flights f = new Flights(id, aircrat, pilot, data, time, flight_number);

                res.add(f);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

}
