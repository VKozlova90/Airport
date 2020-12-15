package db.sql;

import db.Pilots;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PilotsConnector {
    private Connection connection;
    private static final String ADD = "INSERT INTO pilots (name, last_name, rank, pilot_code) VALUES (?, ?, ?, ?)";
    private  static final String REQUEST = "SELECT * FROM pilots";

    public PilotsConnector(Connection connection) {
        this.connection = connection;
    }

    public void add (Pilots pilots){

        try (PreparedStatement statement = connection.prepareStatement(ADD)){
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
    public List<Pilots> readAll(){
        List <Pilots> res = new ArrayList<>();

        try (PreparedStatement statement = connection.prepareStatement(REQUEST)) {

            ResultSet result = statement.executeQuery();
            while (result.next()) {

                int id = result.getInt("id");
                String name = result.getString("name");
                String last_name = result.getString("last_name");
                String rank = result.getString("rank");
                String pilot_code = result.getString("pilot_code");

                Pilots p = new Pilots(id, name, last_name, rank, pilot_code);

                res.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
}
