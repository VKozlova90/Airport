package db.sql;

import db.aircraft;
import db.flights;
import db.pilots;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CodeAdd {

    private Connection connection;

    private static final String ADDpilots = "INSERT INTO pilots (name, last_name, rank, pilot_code)";

    private static final String ADDaircraft = "INSERT INTO aircraft (brand, model, passenger_capacity, tail_number)";

    private static final String ADDflights = "INSERT INTO flights (aircrat, pilot, data, time, flight_number)";

    public CodeAdd (Connection connection) {
        this.connection = connection;
    }

    public void add (pilots pilots) {
        try (PreparedStatement statement = connection.prepareStatement(ADDpilots)){
            statement.setString(1, pilots.getName());
            statement.setString(2, pilots.getLast_name());
            statement.setString(3, pilots.getRank());
            statement.setString(4, pilots.getPilot_code());

            int resPilots = statement.executeUpdate();

            System.out.println(resPilots);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void add (aircraft aircraft) {
        try (PreparedStatement statement = connection.prepareStatement(ADDaircraft)){
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

    public void add (flights flights) {
        try (PreparedStatement statement = connection.prepareStatement(ADDflights)){
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



}
