package de.telran.hw_24Nov.logisticApp;

import de.telran.hw_24Nov.logisticApp.transportTypes.Transport;

/*
Вы строите предприятие по перевозке пассажиров.
Постройте приложение, которое позволит пассажиру находить более удобный транспорт (Самолет, Автобус, Поезд и т.п.)
для поездки исходя из 2-х пожеланий: более низкой стоимости и более быстрого времени доставки.
 */
public class LogisticDemo {
    public static void main(String[] args) {
        LogisticCalculator lc = new LogisticCalculator(300);
        Transport result = lc.getInstance();
        System.out.println(result.toString());
    }
}
