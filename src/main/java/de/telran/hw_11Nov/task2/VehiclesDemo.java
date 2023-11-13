package de.telran.hw_11Nov.task2;

import de.telran.hw_11Nov.task2.vehicles.Bicycle;
import de.telran.hw_11Nov.task2.vehicles.Bus;
import de.telran.hw_11Nov.task2.vehicles.Car;

public class VehiclesDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.setElectric(false);
        car.setModel("VW");
        car.setWheelsCount((byte) 4);
        System.out.println(car);

        Bus bus = new Bus();
        bus.setDriversLicenseIsRequired(true);
        bus.setCommercial(true);
        System.out.println(bus);

        Bicycle bicycle = new Bicycle();
        bicycle.setBikeSize(28);
        bicycle.setWheelsCount((byte) 2);
        System.out.println(bicycle);
    }
}
