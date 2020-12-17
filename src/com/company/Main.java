package com.company;

import com.company.entity.Pilots;
import com.company.io.PilotsDbReader;
import com.company.io.PilotsFileReader;
import com.company.io.PilotsDbWriter;
import java.util.List;

import static com.company.io.FilePathConstants.*;

public class Main {

    public static void main(String[] args) {

        PilotsFileReader reader = new PilotsFileReader(PILOTS_SOURCE_FILE);
        List<Pilots> pilots =  reader.readItens();

        PilotsDbWriter writer = new PilotsDbWriter(pilots);
        writer.saveAll();

        for (Pilots pilots: (new PilotsDbReader()).readAll()){
            System.out.println(pilots);





        }













    }

}
