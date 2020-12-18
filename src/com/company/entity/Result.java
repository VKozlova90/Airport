package com.company.entity;

public class Result {

    private int id;
    private String flight_number;
    private String data;
    private String time;
    private int tail_number;
    private String brand;
    private String model;
    private int passenger_capacity;
    private String name;
    private String last_name;
    private String pilot_code;
    private String rank;

    public Result(int id, String flight_number, String data, String time, int tail_number, String brand, String model, int passenger_capacity, String name, String last_name, String pilot_code, String rank) {
        this.id = id;
        this.flight_number = flight_number;
        this.data = data;
        this.time = time;
        this.tail_number = tail_number;
        this.brand = brand;
        this.model = model;
        this.passenger_capacity = passenger_capacity;
        this.name = name;
        this.last_name = last_name;
        this.pilot_code = pilot_code;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Result{" +
                "id=" + id +
                ", flight_number='" + flight_number + '\'' +
                ", data='" + data + '\'' +
                ", time='" + time + '\'' +
                ", tail_number=" + tail_number +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", passenger_capacity=" + passenger_capacity +
                ", name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", pilot_code='" + pilot_code + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
