package de.telran.hw_11Dec;

import java.util.*;
/*
Вход:
«Berlin» -> «London»
«Tokyo» -> «Seoul»
«Mumbai» -> «Berlin»
«Seoul» -> «Mumbai»
Выход:
Tokyo->Seoul, Seoul->Mumbai, Mumbai->Berlin, Berlin->London
 */
public class Task1 {
    public static void main(String[] args) {
        Map<String, String> trips = new HashMap<>();
        trips.put("Tokyo", "Seoul");
        trips.put("Mumbai", "Berlin");
        trips.put("Berlin", "London");
        trips.put("Seoul", "Mumbai");

        //ищем первый ключ
        Map.Entry<String, String> currentElem = null;
        for (Map.Entry<String, String> trip : trips.entrySet()) {
            if (!trips.containsValue(trip.getKey())) {
                currentElem = trip;
            }
        }
        // создаем новую мапу, куда будем добавлять сегменты в нужном порядке
        Map<String, String> orderedTrips = new LinkedHashMap<>();
        orderedTrips.put(currentElem.getKey(), currentElem.getValue());
        int i = 0;
        while (i < 4) {
            for (Map.Entry<String, String> trip : trips.entrySet()) {
                if (trip.getKey().equals(currentElem.getValue())) {
                    currentElem = trip;
                    orderedTrips.put(currentElem.getKey(), currentElem.getValue());
                }
            }
            i++;
        }
        System.out.println(orderedTrips);
    }
}
