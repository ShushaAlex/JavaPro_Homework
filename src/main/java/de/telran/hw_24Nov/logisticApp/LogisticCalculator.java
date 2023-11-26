package de.telran.hw_24Nov.logisticApp;

import de.telran.hw_24Nov.logisticApp.transportTypes.Bus;
import de.telran.hw_24Nov.logisticApp.transportTypes.Plane;
import de.telran.hw_24Nov.logisticApp.transportTypes.Train;
import de.telran.hw_24Nov.logisticApp.transportTypes.Transport;

public class LogisticCalculator {
    private int distance;

    public LogisticCalculator(int distance) {
        this.distance = distance;
    }

    public Transport getInstance() {
        Transport[] transports = {new Bus(), new Train(), new Plane()};
        Transport tmp = transports[0];
        for (int i = 1; i < transports.length; i++) {
            if (tmp.calcParams(distance) > transports[i].calcParams(distance)) {
                tmp = transports[i];
            }
        }
        return tmp;
    }
}
