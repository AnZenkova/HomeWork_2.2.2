package com.company;

public class Main {

    public static void main(String[] args) {

        Bicycle[] bicycles = {
                new Bicycle("Sport-1.1", 2),
        };
        Car[] cars = {
                new Car("S-5", 4)
        };
        Transport[] transports = new Transport[bicycles.length + cars.length];
        for (int i = 0; i < bicycles.length; i++) {
            transports[i] = bicycles[i];
        }
        for (int i = 0; i < cars.length; i++) {
            transports[i + bicycles.length] = cars[i];
        }
        Bicycle.updateTyre();
        Car.updateTyre();
        Car.checkEngine();
        System.out.println();
        ServiceStation.check(transports[0]);
        System.out.println();
        ServiceStation.check(transports[1]);
        System.out.println();
        ServiceStation.check(cars[0]);
        System.out.println();
        ServiceStation.check(bicycles[0]);
    }
}
