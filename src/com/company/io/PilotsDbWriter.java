package com.company.io;

import com.company.entity.Pilots;
import com.company.util.DbConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PilotsDbWriter {
    private List <Pilots> pilots;
    private static final String ADD = "INSERT INTO pilots (id, name, last_name, rank, pilot_code) VALUES (?, ?, ?, ?,?)";

    public PilotsDbWriter(List<Pilots> pilots) {
        this.pilots = pilots;
    }

    public void saveAll(){
        for (Pilots pilots : pilots){
            save(pilots);
        }
    }

    private void save(Pilots pilots){
        Connection connection = DbConnectionUtil.detConnection();

        try (PreparedStatement statement = connection.prepareStatement(ADD)){
            statement.setInt(1, pilots.getId());
            statement.setString(2, pilots.getName());
            statement.setString(3, pilots.getLast_name());
            statement.setString(4, pilots.getRank());
            statement.setString(5, pilots.getPilot_code());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
