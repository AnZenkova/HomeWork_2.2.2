package com.company;

public class Main {

    public static void main(String[] args) {

        Bicycle[] bicycles = {
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2)
        };

        Car[] cars = {
                new Car("car1", 4),
                new Car("car2", 4)
        };

        Truck[] trucks = {
             new Truck("truck1",6),
             new Truck("truck2",8),
        };
        System.out.println(trucks[0].getModelName());
        Transport[] transports = new Transport[bicycles.length + cars.length + trucks.length];
        for (int i = 0; i < bicycles.length; i++) {
            transports[i] = bicycles[i];
        }
        for (int i = 0; i < cars.length; i++) {
            transports[i + bicycles.length] = cars[i];
        }
        for (int i = 0; i < trucks.length; i++) {
            transports[i + bicycles.length + cars.length] = trucks[i];
        }
        Bicycle.updateTyre();
        Car.updateTyre();
        Car.checkEngine();
        System.out.println();
        ServiceStation.checkTransport(transports[0]);
        System.out.println();
        ServiceStation.checkTransport(transports[1]);
        System.out.println();
        ServiceStation.check(cars[0]);
        System.out.println();
        ServiceStation.check(bicycles[0]);
        System.out.println();
        ServiceStation.checkTransport(transports[2]);
        System.out.println();
        ServiceStation.check(trucks[0]);

        ServiceStation station = new ServiceStation(); // 1-й вариант
        station.check(cars[0]);
        station.check(cars[1]);
        station.check(bicycles[0]);
        station.check(bicycles[1]);
        station.check(trucks[0]);
        station.check(trucks[1]);
        System.out.println();

        ServiceStation station1 = new ServiceStation(); // 2-й вариант
        for (int i = 0; i < transports.length; i++) {
            station1.checkTransport(transports[i]);
            System.out.println();
        }
    }
}
