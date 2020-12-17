package com.company;

import java.sql.Connection;

public class ResultConnector {

    private Connection connection;

    private  static final String RESULT =
    "SELECT f.flight_number, f.data, f.time, * FROM flights AS f JOIN aircraft AS a ON f.aircrat AND f.pilot";

    public ResultConnector(Connection connection) {
        this.connection = connection;
    }



}
