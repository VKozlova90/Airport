package com.company.io;

import com.company.entity.Aircraft;
import com.company.util.AircraftUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AircraftFileReader {

    private  final  String filepath;

    public AircraftFileReader(String filepath) {
        this.filepath = filepath;
    }

    public List<Aircraft> readItens() {
        List <Aircraft> result = new ArrayList<>();
        try (BufferedReader reader1= new BufferedReader(new FileReader(filepath))){
            String line = null;

            while ((line = reader1.readLine()) != null){
                Aircraft aircraft = AircraftUtil.toObject(line);

                result.add(aircraft);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении");
        }

        return new ArrayList<>();

    }

}
