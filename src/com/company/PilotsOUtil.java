package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PilotsOUtil {

    private List<Pilots> pilots;
    private String filepath;

    public PilotsOUtil(List<Pilots> pilots, String filepath) {
        this.pilots = pilots;
        this.filepath = filepath;
    }

    public static String FormatPilotsForWriting (Pilots pilots) {
        return pilots.getId() + ";" + pilots.getName()+ ";" + pilots.getLast_name()+ ";" + pilots.getRank()+ ";"
                + pilots.getPilot_code()+ "\n";
    }

    public static Pilots FormatObject (String s){

        String[] fields = s.split(";");
        int id = fields[0];
        String name = fields[1];
        String last_name = fields[2];
        String rank = fields[3];
        String pilot_code = fields[4];

        return new Pilots (id,name, last_name, rank, pilot_code);

    }

    public static void writePilots(List<Pilots> pilots, String filepath) {
        try (FileWriter writer = new FileWriter(filepath)) {

            for (Pilots pilots : pilots) {
                String s = PilotsOUtil.FormatPilotsForWriting(pilots);
                writer.write(s);
            }
        } catch (IOException e) {
            System.out.println("Запись в файл не удалась");
        }
    }

    public PilotsOUtil(String filepath) {
        this.filepath = filepath;
    }

    public static void  readPilots(String filepath) {
        List<Pilots> result = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String s;
            while ((s = reader.readLine()) != null) {
                Pilots pilots = PilotsOUtil.FormatObject(s);
                System.out.println(pilots);

                result.add(pilots);
            }
        } catch (IOException e) {
            System.out.println("Чтение не удалось");
        }
    }

}
