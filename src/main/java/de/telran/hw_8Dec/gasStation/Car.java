package de.telran.hw_8Dec.gasStation;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private CarType carType;
    private int number;

    public Car(CarType carType, int number) {
        this.carType = carType;
        this.number = number;
    }

    public CarType getCarType() {
        return carType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return carType == car.carType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carType);
    }

    @Override
    public int compareTo(Car o) {
        if (this.carType == CarType.AMBULANCE)
            return -1;
        if  (o.carType == CarType.AMBULANCE)
            return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", number=" + number +
                '}';
    }
}
