package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Pilots> pilots= new ArrayList<>();

        pilots.add (new Pilots(-1, "A1", "B1", Rank.PILOT, "AB1"));
        pilots.add (new Pilots(-1, "A2", "B2", Rank.TRAINEE, "AB2"));
        pilots.add (new Pilots(-1, "A3", "B3", Rank.INSTRUCTOR_PILOT, "AB3"));
        pilots.add (new Pilots(-1, "A4", "B4", Rank.SECOND_PILOT, "AB4"));
        pilots.add (new Pilots(-1, "A5", "B5", Rank.SENIOR_PILOT, "AB5"));

        System.out.println(pilots);

        try (FileWriter writer =new FileWriter("pilots.csv")){

           for (Pilots pilots : pilots){
               String s =PilotsOUtil.FormatPilotsForWriting(pilots);
               writer.write(s);

           }

        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Aircraft> aircraft= new ArrayList<>();
        aircraft.add(new Aircraft(-1, "BR1", "MOD1", 89, 1212));
        aircraft.add(new Aircraft(-1, "BR2", "MOD2", 125, 1313));
        aircraft.add(new Aircraft(-1, "BR3", "MOD3", 8, 1414));
        aircraft.add(new Aircraft(-1, "BR4", "MOD4", 277, 1515));
        aircraft.add(new Aircraft(-1, "BR5", "MOD5", 159, 1616));

        System.out.println(aircraft);
        try (FileWriter writer =new FileWriter("aircraft.csv")){

            for (Aircraft aircraft : aircraft){
                String a =AircraftOUtil.FormatAircraftForWriting(aircraft);
                writer.write(a);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Flights> flights= new ArrayList<>();
        flights.add (new Flights(-1, 2, 5, "1.1.2020", "1:00", 1719));
        flights.add (new Flights(-1, 2, 5, "2.2.2020", "2:20", 1719));
        flights.add (new Flights(-1, 2, 5, "3.3.2020", "3:30", 1719));
        flights.add (new Flights(-1, 2, 5, "4.5.2020", "4:40", 1719));
        flights.add (new Flights(-1, 2, 5, "5.5.2020", "5:50", 1719));

        System.out.println(flights);
        try (FileWriter writer =new FileWriter("flights.csv")){

            for (Flights flights : flights){
                String f =FlightsOUtil.FormatFlightsForWriting(flights);
                writer.write(f);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }





    }

}
