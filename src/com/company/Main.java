package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vehicle car1 = new Car("black", "Toyota", 2002);
        Car car2 = new Car("white", "Tesla", 2018);

        Vehicle suv1 = new SUV("red", 2003, "Chevrolet");
        SUV suv2 = new SUV();

        Vehicle truck1 = new Truck("green", 2003, "Chevrolet");
        Truck truck2 = new Truck("brown", 2018, "Ram");

        car2.setKind("Ford");
        car2.setYear(2020);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(suv1);
        System.out.println(suv2);
        System.out.println(truck1);
        System.out.println(truck2);
    }
}
