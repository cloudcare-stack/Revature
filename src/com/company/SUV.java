package com.company;

public class SUV extends Vehicle{

    private String kind;
    private int year;

    public SUV(){
        super();
    }

    public SUV(String color, int year, String kind) {
        super(color);
        this.year = year;
        this.kind = kind;
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
        return "The color, year, and model of a SUV is " + this.color + ", " + this.year + ", " + this.kind;
    }
}
