package db.data;

import java.sql.Connection;

public class TableAircraft {

    private Connection connection;

    public TableAircraft(Connection connection) {
        this.connection = connection;
    }
}
