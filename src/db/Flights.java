package db;

import java.sql.Time;
import java.sql.Date;

public class Flights {

    private int id;
    private int aircrat;
    private int pilot;
    private Date data;
    private Time time;
    private int flight_number;

    public Flights(int id, int aircrat, int pilot, String data, String time, int flight_number) {
        this.id = id;
        this.aircrat = aircrat;
        this.pilot = pilot;
        this.data = data;
        this.time = time;
        this.flight_number = flight_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAircrat() {
        return aircrat;
    }

    public void setAircrat(int aircrat) {
        this.aircrat = aircrat;
    }

    public int getPilot() {
        return pilot;
    }

    public void setPilot(int pilot) {
        this.pilot = pilot;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(int flight_number) {
        this.flight_number = flight_number;
    }

    @Override
    public String toString() {
        return "flights{" +
                "id=" + id +
                ", aircrat=" + aircrat +
                ", pilot=" + pilot +
                ", data=" + data +
                ", time=" + time +
                ", flight_number=" + flight_number +
                '}';
    }
}
