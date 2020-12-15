package db.data;
import db.Flights;
import db.sql.FlightsConnector;

import java.sql.Connection;

public class TableFlights {

    private Connection connection;

    public TableFlights(Connection connection) {
        this.connection = connection;
    }

    Flights flights = new Flights (-1, 2, 5, "1.1.2020","1:00",1719);
    Flights flights1 = new Flights (-1, 2, 5, "2.2.2020","2:20",1719);
    Flights flights2 = new Flights (-1, 2, 5, "3.3.2020","3:30",1719);
    Flights flights3 = new Flights (-1, 2, 5, "4.5.2020","4:40",1719);
    Flights flights4 = new Flights (-1, 2, 5, "5.5.2020","5:50",1719);

    FlightsConnector connector = new FlightsConnector(connection);
    connector.add (flights);


}
