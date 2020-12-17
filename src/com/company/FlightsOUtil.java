package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FlightsOUtil {

    private List<Flights> flights;
    private String filepath;

    public FlightsOUtil(List<Flights> flights, String filepath) {
        this.flights = flights;
        this.filepath = filepath;
    }

    public static String FormatFlightsForWriting (Flights flights) {
        return flights.getId() + ";" + flights.getAircrat()+ ";" + flights.getPilot() + ";"
                + flights.getData() + ";"+ flights.getTime() + ";"+ flights.getFlight_number()  + "\n";
    }

    public static Flights FormatObject (String f){

        String[] fields = f.split(";");
        int id = Integer.parseInt(fields[0]);
        int aircrat = Integer.parseInt(fields[1]);
        int pilot = Integer.parseInt(fields[2]);
        String data = fields[3];
        String time = fields[4];
        int flight_number = Integer.parseInt(fields[5]);

        return new Flights (id,aircrat, pilot, data, time, flight_number);

    }

    public static void writeFlights(List<Flights> flights, String filepath) {
        try (FileWriter writer = new FileWriter(filepath)) {

            for (Flights flights : flights) {
                String f = FlightsOUtil.FormatFlightsForWriting(flights);
                writer.write(f);
            }
        } catch (IOException e) {
            System.out.println("Запись в файл не удалась");
        }
    }

    public FlightsOUtil(String filepath) {
        this.filepath = filepath;
    }

    public static void  readFlights(String filepath) {
        List< Flights> result = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String f;
            while ((f = reader.readLine()) != null) {
                Flights flights = FlightsOUtil.FormatObject(f);
                System.out.println(flights);

                result.add(flights);
            }
        } catch (IOException e) {
            System.out.println("Чтение не удалось");
        }
    }
}
