package db.data;

import java.sql.Connection;

public class TableFlights {

    private Connection connection;

    public TableFlights(Connection connection) {
        this.connection = connection;
    }
}
