package com.company.util;

import com.company.entity.Pilots;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PilotsUtil {

    public static Pilots toObject (String line){
        String [] pilotsArgs = line.split(";");

        int id = Integer.parseInt(pilotsArgs[0]);
        String name = pilotsArgs[1];
        String last_name = pilotsArgs[2];
        String rank = pilotsArgs[3];
        String pilot_code = pilotsArgs[4];

       return new Pilots(id, name, last_name, rank, pilot_code);

    }

//    private List<Pilots> pilots;
//    private String filepath;
//
//    public PilotsUtil(List<Pilots> pilots, String filepath) {
//        this.pilots = pilots;
//        this.filepath = filepath;
//    }
//
//    public static String FormatPilotsForWriting (Pilots pilots) {
//        return pilots.getId() + ";" + pilots.getName()+ ";" + pilots.getLast_name()+ ";" + pilots.getRank()+ ";"
//                + pilots.getPilot_code()+ "\n";
//    }
//
//    public static Pilots FormatObject (String s){
//
//        String[] fields = s.split(";");
//        int id = Integer.parseInt(fields[0]);
//        String name = fields[1];
//        String last_name = fields[2];
//        String rank = fields[3];
//        String pilot_code = fields[4];
//
//        return new Pilots (id,name, last_name, rank, pilot_code);
//
//    }
//
//    public static void writePilots(List<Pilots> pilots, String filepath) {
//        try (FileWriter writer = new FileWriter(filepath)) {
//
//            for (Pilots pilots : pilots) {
//                String s = PilotsUtil.FormatPilotsForWriting(pilots);
//                writer.write(s);
//            }
//        } catch (IOException e) {
//            System.out.println("Запись в файл не удалась");
//        }
//    }
//
//    public PilotsUtil(String filepath) {
//        this.filepath = filepath;
//    }
//
//    public static void  readPilots(String filepath) {
//        List<Pilots> result = new ArrayList<>();
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
//            String s;
//            while ((s = reader.readLine()) != null) {
//                Pilots pilots = PilotsUtil.FormatObject(s);
//                System.out.println(pilots);
//
//                result.add(pilots);
//            }
//        } catch (IOException e) {
//            System.out.println("Чтение не удалось");
//        }
//    }

}
