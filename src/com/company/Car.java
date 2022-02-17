package com.company;

public class Car extends Vehicle{

    private String kind;
    private int year;

    public Car(){
        super();
    }

    public Car(String color, String kind, int year){
        super(color);
        this.kind = kind;
        this.year = year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    public void setKind(String kind){
         this.kind = kind;
    }

    public String getKind(){
        return kind;
    }

    @Override
    public String toString() {
        return "The color, year, and model of a car is " + this.color + ", " + this.year + ", " + this.kind;
    }
}
