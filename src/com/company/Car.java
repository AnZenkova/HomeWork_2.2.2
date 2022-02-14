package com.company;
public class Car extends  Transport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public static void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
