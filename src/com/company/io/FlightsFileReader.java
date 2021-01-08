package com.company.io;

import com.company.entity.Flights;
import com.company.util.FlightsUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FlightsFileReader {

    private  final  String filepath;

    public FlightsFileReader(String filepath) {
        this.filepath = filepath;
    }

    public List<Flights> readItems() {
        List <Flights> result = new ArrayList<>();
        try (BufferedReader reader2= new BufferedReader(new FileReader(filepath))){
            String line = null;

            while ((line = reader2.readLine()) != null){
                Flights flights = FlightsUtil.toObject(line);

                result.add(flights);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении");
        }

        return result;

    }
}
