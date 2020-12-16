package com.company;

public class Aircraft {

    private int id;
    private String brand;
    private String model;
    private int passenger_capacity;
    private int tail_number;

    public Aircraft(int id, String brand, String model, int passenger_capacity, int tail_number) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.passenger_capacity = passenger_capacity;
        this.tail_number = tail_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPassenger_capacity() {
        return passenger_capacity;
    }

    public void setPassenger_capacity(int passenger_capacity) {
        this.passenger_capacity = passenger_capacity;
    }

    public int getTail_number() {
        return tail_number;
    }

    public void setTail_number(int tail_number) {
        this.tail_number = tail_number;
    }

    @Override
    public String toString() {
        return "aircraft{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", passenger_capacity=" + passenger_capacity +
                ", tail_number=" + tail_number +
                '}';
    }
}
