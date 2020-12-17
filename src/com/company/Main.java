package com.company;

import com.company.entity.Aircraft;
import com.company.entity.Flights;
import com.company.entity.Pilots;
import com.company.io.*;

import java.util.List;

import static com.company.io.FilePathConstants.*;

public class Main {

    public static void main(String[] args) {

        PilotsFileReader reader = new PilotsFileReader(PILOTS_SOURCE_FILE);
        List <Pilots> pilots =  reader.readItens();

        PilotsDbWriter writer = new PilotsDbWriter(pilots);
        writer.saveAll();


        AircraftFileReader reader1 = new AircraftFileReader(AIRCRAFT_SOURCE_FILE);
        List <Aircraft> aircraft =  reader1.readItens();

        AircraftDbWriter writer1 = new AircraftDbWriter(aircraft);
        writer1.saveAll();


        FlightsFileReader reader2 = new FlightsFileReader(FLIGHTS_SOURCE_FILE);
        List <Flights> flights =  reader2.readItens();

        FlightsDbWriter writer2 = new FlightsDbWriter(flights);
        writer2.saveAll();

        }

 }
