package de.telran.hw_17Nov.toys;

import de.telran.hw_17Nov.toys.entities.Boat;
import de.telran.hw_17Nov.toys.entities.Car;
import de.telran.hw_17Nov.toys.entities.Doll;
import de.telran.hw_17Nov.toys.entities.Plane;

/*
Мы делаем игрушки и основные требования для них:
быть безопасной, быть радиоуправляемой, летать, плавать, подавать голосовой сигнал.
Для начала выпускаем куклу, самолет, машинку и катер.
Создать классы данных игрушек для создания объектов на конвейере. Требования для них описать интерфейсами…)
*/

public class ToyConveyor {
    public static void main(String[] args) {
        Doll doll = new Doll("Hello!");
        doll.setSound("Hallo!");
        doll.beSafe();
        doll.voice();
        doll.remoteControl();

        Plane plane = new Plane("Pshhhhh");
        plane.beSafe();
        plane.voice();
        plane.remoteControl();
        plane.fly();

        Boat boat = new Boat("bul bul bul");
        boat.beSafe();
        boat.voice();
        boat.remoteControl();
        boat.swim();

        Car car = new Car("bip bip bip");
        car.beSafe();
        car.voice();
        car.remoteControl();
    }
}
