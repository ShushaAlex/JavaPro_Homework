package de.telran.hw_8Dec.brickWarehouse;

import java.time.LocalDate;

public class BrickPallet {
    private LocalDate date;
    private int serialNumber;
    public static int COUNTER = 1;

    public BrickPallet() {
        this.date = LocalDate.now();
        this.serialNumber = COUNTER;
       COUNTER++;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "BrickPallet{" +
                "date=" + date +
                ", serialNumber=" + serialNumber +
                '}';
    }
}