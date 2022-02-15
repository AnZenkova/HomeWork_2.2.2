package com.company;
public class ServiceStation {
    public static void check(Transport transport) {
        if (transport instanceof Car) {
            System.out.println("Обслуживаем " + transport.getModelName());
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                Transport.updateTyre();
            }
            Car.checkEngine();
//        } else if (transport instanceof Truck) {
//            System.out.println("Обслуживаем " + transport.getModelName());
//            for (int i = 0; i < transport.getWheelsCount(); i++) {
//                Transport.updateTyre();
//            }
//            truck.checkEngine();
//            truck.checkTrailer();
        } else if (transport instanceof Bicycle) {
            System.out.println("Обслуживаем " + transport.getModelName());
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                Transport.updateTyre();
            }
        }
    }

    public static void check(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            car.updateTyre();
        }
        car.checkEngine();
    }

//    public void check(Truck truck) {
//        System.out.println("Обслуживаем " + truck.modelName);
//        for (int i = 0; i < truck.wheelsCount; i++) {
//            truck.updateTyre();
//        }
//        truck.checkEngine();
//        truck.checkTrailer();
//    }
    public static void check(Bicycle bicycle) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
    }
}

