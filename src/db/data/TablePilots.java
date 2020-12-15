package db.data;

import db.Pilots;
import db.Rank;
import db.sql.PilotsConnector;

import java.sql.Connection;

public class TablePilots {

    private Connection connection;

    public TablePilots(Connection connection) {
        this.connection = connection;
    }

    Pilots pilots = new Pilots (-1, "A1", "B1", Rank.PILOT, "AB1");
    Pilots pilots1 = new Pilots (-1, "A2", "B2", Rank.TRAINEE, "AB2");
    Pilots pilots2 = new Pilots (-1, "A3", "B3", Rank.INSTRUCTOR_PILOT, "AB3");
    Pilots pilots3 = new Pilots (-1, "A4", "B4", Rank.SECOND_PILOT, "AB4");
    Pilots pilots4 = new Pilots (-1, "A5", "B5", Rank.SENIOR_PILOT, "AB5");

    PilotsConnector connector = new PilotsConnector(connection);
    connector.add (pilots);
    connector.add (pilots1);
    connector.add (pilots2);
    connector.add (pilots3);
    connector.add (pilots4);

        for (Pilots p : connector.readAll()){
        System.out.println(p);
    }





}
