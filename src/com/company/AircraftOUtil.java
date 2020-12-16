package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AircraftOUtil {

    private List<Aircraft> aircraft;
    private String filepath;

    public AircraftOUtil(List<Aircraft> aircraft, String filepath) {
        this.aircraft = aircraft;
        this.filepath = filepath;
    }

    public static String FormatAircraftForWriting (Aircraft aircraft) {
        return aircraft.getId() + ";" + aircraft.getBrand()+ ";" + aircraft.getModel() + ";"
                + aircraft.getPassenger_capacity() + ";"+ aircraft.getTail_number() + "\n";
    }

    public static Aircraft FormatObject (String a){

        String[] fields = a.split(";");
        int id = fields[0];
        String brand = fields[1];
        String model = fields[2];
        int passenger_capacity = fields[3];
        int tail_number = fields[4];

        return new Aircraft (id,brand, model, passenger_capacity, tail_number);

    }

    public static void writeAircraft(List<Aircraft> aircraft, String filepath) {
        try (FileWriter writer = new FileWriter(filepath)) {

            for (Aircraft aircraft : aircraft) {
                String a = AircraftOUtil.FormatAircraftForWriting(aircraft);
                writer.write(a);
            }
        } catch (IOException e) {
            System.out.println("Запись в файл не удалась");
        }
    }

    public AircraftOUtil(String filepath) {
        this.filepath = filepath;
    }

    public static void  readAircraft(String filepath) {
        List<Aircraft> result = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String a;
            while ((a = reader.readLine()) != null) {
                Aircraft aircraft = AircraftOUtil.FormatObject(a);
                System.out.println(aircraft);

                result.add(aircraft);
            }
        } catch (IOException e) {
            System.out.println("Чтение не удалось");
        }
    }

}
