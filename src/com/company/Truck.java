package com.company;

public class Truck extends Vehicle{

    private final String kind;
    private final int year;

    public Truck(String color, int year, String kind) {
        super();
        this.color = color;
        this.year = year;
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "The color, year, and model of a truck is " + this.color + ", " + this.year + ", " + this.kind;
    }
}
