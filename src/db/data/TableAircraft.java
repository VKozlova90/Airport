package db.data;
import db.Aircraft;
import db.sql.AiircraftConnector;

import java.sql.Connection;

public class TableAircraft {

    private Connection connection;

    public TableAircraft(Connection connection) {
        this.connection = connection;
    }

    Aircraft aircraft = new Aircraft(-1, "BR1", "MOD1", 89, 1212);
    Aircraft aircraft1 = new Aircraft (-1, "BR2", "MOD2", 125, 1313);
    Aircraft aircraft2 = new Aircraft (-1, "BR3", "MOD3", 8, 1414);
    Aircraft aircraft3 = new Aircraft (-1, "BR4", "MOD4", 277, 1515);
    Aircraft aircraft4 = new Aircraft (-1, "BR5", "MOD5", 159, 1616);

    AiircraftConnector connector = new AiircraftConnector(connection);
    connection.add (aircraft);
    connector.add (aircraft1);
    connector.add (aircraft2);
    connector.add (aircraft3);
    connector.add (aircraft4);

        for (Aircraft a : connector.readAll()){
        System.out.println(a);
    }

}
