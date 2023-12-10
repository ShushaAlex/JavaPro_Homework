package de.telran.hw_8Dec.gasStation;

import java.util.Comparator;
import java.util.PriorityQueue;

public class GasStationDemo {
    public static PriorityQueue<Car> getCarQueue(Conditions conditions) {
        if (conditions == Conditions.RUSH_HOUR)
            return new PriorityQueue<>(new Comparator<Car>() {
                @Override
                public int compare(Car o1, Car o2) {
                    if (o1.getCarType() == CarType.AMBULANCE)
                        return -1;
                    if (o2.getCarType() == CarType.AMBULANCE)
                        return 1;
                    if (o1.getCarType() == CarType.PUBLIC_TRANSPORT)
                        return -1;
                    if (o2.getCarType() == CarType.PUBLIC_TRANSPORT)
                        return 1;
                    return 0;
                }
            });
        if (conditions == Conditions.NATURAL_DISASTER)
            return new PriorityQueue<>(new Comparator<Car>() {
                @Override
                public int compare(Car o1, Car o2) {
                    if (o1.getCarType() == CarType.EMERGENCY_SERVICES)
                        return -1;
                    if (o2.getCarType() == CarType.EMERGENCY_SERVICES)
                        return 1;
                    if (o1.getCarType() == CarType.AMBULANCE)
                        return -1;
                    if (o2.getCarType() == CarType.AMBULANCE)
                        return 1;
                    return 0;
                }
            });
        return new PriorityQueue<>();
    }

    public static void main(String[] args) {
        PriorityQueue<Car> carQueue = new PriorityQueue<>();
        carQueue.add(new Car(CarType.AMBULANCE, 1));
        carQueue.add(new Car(CarType.SIMPLE, 2));
        carQueue.add(new Car(CarType.SIMPLE, 3));
        carQueue.add(new Car(CarType.AMBULANCE, 4));
        carQueue.add(new Car(CarType.PUBLIC_TRANSPORT, 5));
        carQueue.add(new Car(CarType.EMERGENCY_SERVICES, 6));
        carQueue.add(new Car(CarType.SIMPLE, 7));
        carQueue.add(new Car(CarType.PUBLIC_TRANSPORT, 8));
        carQueue.add(new Car(CarType.EMERGENCY_SERVICES, 9));

        PriorityQueue<Car> normalQueue = getCarQueue(Conditions.NORMAL);
        normalQueue.addAll(carQueue);
        System.out.println("Normal queue");
        while (!normalQueue.isEmpty()) {
            System.out.println(normalQueue.remove());
        }

        PriorityQueue<Car> disasterQueue = getCarQueue(Conditions.NATURAL_DISASTER);
        disasterQueue.addAll(carQueue);
        System.out.println("Disaster queue");
        while (!disasterQueue.isEmpty()) {
            System.out.println(disasterQueue.remove());
        }

        PriorityQueue<Car> rushHourQueue = getCarQueue(Conditions.RUSH_HOUR);
        rushHourQueue.addAll(carQueue);
        System.out.println("Rush hour queue");
        while (!rushHourQueue.isEmpty()) {
            System.out.println(rushHourQueue.remove());
        }
    }
}
