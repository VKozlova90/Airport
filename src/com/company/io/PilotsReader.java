package com.company.io;

import com.company.entity.Pilots;
import com.company.util.PilotsUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PilotsReader {
    private  final  String filepath;

    public PilotsReader(String filepath) {
        this.filepath = filepath;
    }

    public List<Pilots> readItens() {
        List <Pilots> result = new ArrayList<>();
        try (BufferedReader reader= new BufferedReader(new FileReader(filepath))){
            String line = null;

            while ((line = reader.readLine()) != null){
            Pilots pilots = PilotsUtil.toObject(line);

           result.add(pilots);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении");
        }

        return new ArrayList<>();

    }


}