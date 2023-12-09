package de.telran.hw_6Dec.transport;

import java.util.HashSet;
import java.util.Random;

public class TransportDemo {

    public static int getRandomInt() {
        Random random = new Random();
        return random.nextInt(1000);
    }
    public static HashSet<Bus> getBuses(HashSet<Bus> busHashSet, int routNum) {
        HashSet<Bus> busSet = new HashSet<>();
        for (Bus bus : busHashSet) {
            if (bus.getRoutNumber() == routNum)
                busSet.add(bus);
        }
        return busSet;
    }
    public static void main(String[] args) {
        HashSet<Bus> busSet = new HashSet<Bus>();

        busSet.add(new Bus(13, 9090));
        busSet.add(new Bus(13, 9192));
        busSet.add(new Bus(1, 7878));
        busSet.add(new Bus(6, 6767));
        busSet.add(new Bus(1, 5414));

        // задаем координаты
        for (Bus bus : busSet) {
            bus.setGps(getRandomInt(), getRandomInt());
        }

        // по номеру автобуса получаем все доступные
        System.out.println(getBuses(busSet, 13));

        // меняем координаты
        for (Bus bus : busSet) {
            bus.setGps(getRandomInt(), getRandomInt());
        }

        // снова по номеру автобуса получаем все доступные
        System.out.println(getBuses(busSet, 13));
        System.out.println(getBuses(busSet, 6));
    }
}
