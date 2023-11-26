package de.telran.hw_24Nov.logisticApp.transportTypes;

public interface Transport {
 void moveFromAtoB(String placeA, String placeB);
 public int calcParams(int distance);
}
