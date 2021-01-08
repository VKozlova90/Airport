package com.company.entity;

public class Result {

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
    private Rank rank;

    public Result(String flight_number, String data, String time, int tail_number, String brand, String model, int passenger_capacity, String name, String last_name, String pilot_code, Rank rank) {
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

    public String getFlight_number() {
        return flight_number;
    }

    public String getData() {
        return data;
    }

    public String getTime() {
        return time;
    }

    public int getTail_number() {
        return tail_number;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPassenger_capacity() {
        return passenger_capacity;
    }

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getPilot_code() {
        return pilot_code;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Result{" +
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
