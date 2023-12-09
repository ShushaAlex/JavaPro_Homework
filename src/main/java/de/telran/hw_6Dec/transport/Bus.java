package de.telran.hw_6Dec.transport;

import java.util.Arrays;
import java.util.Objects;

/*
hashSet
создаем автобусы
записываем в хэшсет
в цикле меняем им координаты
делаем запрос по номеру маршрута -> отдаем коллекцию с автобусами этого номера
меняем снова координаты
 */
public class Bus {
    private int routNumber;
    private int busId;
    private int[] gps = new int[2];

    public Bus(int routNumber, int busId) {
        this.routNumber = routNumber;
        this.busId = busId;
    }

    public int[] getGps() {
        return gps;
    }

    public void setGps(int gps1, int gps2) {
        this.gps[0] = gps1;
        this.gps[1] = gps2;
    }

    public int getRoutNumber() {
        return routNumber;
    }

    public int getBusId() {
        return busId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus that = (Bus) o;
        return busId == that.busId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(busId);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "routNumber=" + routNumber +
                ", busId=" + busId +
                ", gps=" + Arrays.toString(gps) +
                '}';
    }
}
