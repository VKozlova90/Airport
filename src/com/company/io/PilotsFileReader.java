package com.company.io;

import com.company.entity.Pilots;
import com.company.util.PilotsUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PilotsFileReader {
    private  final  String filepath;

    public PilotsFileReader(String filepath) {
        this.filepath = filepath;
    }

    public List<Pilots> readItems() {
        List <Pilots> result = new ArrayList<>();
        try (BufferedReader reader= new BufferedReader(new FileReader(filepath))){
            String line;

            while ((line = reader.readLine()) != null){
            Pilots pilots = PilotsUtil.toObject(line);
           result.add(pilots);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении");
        }
        return result;
    }
}
