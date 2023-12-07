package de.telran.hw_6Dec.bank;

import java.util.Comparator;

public class ComparatorOperationType implements Comparator<Ticket> {
    @Override
    public int compare(Ticket o1, Ticket o2) {
        if (o1.isPriority() && o2.isPriority())
            return Integer.compare(o1.getTicketNumber(), o2.getTicketNumber());
        if (o1.isPriority())
            return -1;
        if (o2.isPriority())
            return 1;
        return Integer.compare(o1.getTicketNumber(), o2.getTicketNumber());
    }
}
