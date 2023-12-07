package de.telran.hw_6Dec.bank;

import javax.crypto.spec.PSource;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
/*
По умолчанию, все клиенты обслуживаются в порядке возрастания номеров талончиков, но если есть клиенты, которые пришли выполнить
Вложение средств или Открытие депозита - они будут обслужены вне очереди.
Но начиная с определенного времени (например с 10 - 12 часов), без очереди обслуживаются люди пенсионного возраста (возраст более 65).
 */

public class BankDemo {

    public static void setTicketNumber(ArrayList<Ticket> tickets) {
        Iterator<Ticket> iterator = tickets.iterator();
        int i = 1;
        while (iterator.hasNext()) {
            Ticket ticket = iterator.next();
            ticket.setTicketNumber(i);
            i++;
        }
    }
    public static void getTicketsOrder(ArrayList<Ticket> tickets, LocalTime time) {
        if (time.getHour() >= 10 && time.getHour() <= 12)
            tickets.sort(new ComparatorAge());
        else tickets.sort(new ComparatorOperationType());
    }

    public static void main(String[] args) {
        // создали клиентов
        ArrayList<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket("Ivan", "Ivanov", 1991, OperationType.CONSULTATION));
        tickets.add(new Ticket("Petr", "Gritsenko", 1981, OperationType.PAYMENT));
        tickets.add(new Ticket("Ivan", "Petrov", 2001, OperationType.WITHDRAW));
        tickets.add(new Ticket("Irina", "Kot", 1971, OperationType.NEW_DEPOSIT));
        tickets.add(new Ticket("Denis", "Korzh", 1945, OperationType.DEPOSIT));
        tickets.add(new Ticket("Dmitry", "Asakhov", 2003, OperationType.NEW_DEPOSIT));
        tickets.add(new Ticket("Marina", "Pak", 1953, OperationType.CONSULTATION));
        // присвоили им номера талонов
        setTicketNumber(tickets);

        getTicketsOrder(tickets, LocalTime.of(11, 23));
        System.out.println(tickets);

        getTicketsOrder(tickets, LocalTime.of(9, 23));
        System.out.println(tickets);

        System.out.println(LocalDateTime.now().getYear());

    }
}
