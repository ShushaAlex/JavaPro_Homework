package de.telran.hw_6Dec.bank;

import java.util.Comparator;

public class ComparatorAge implements Comparator<Ticket> {
    @Override
    public int compare(Ticket o1, Ticket o2) {
        if (o1.isOld() && o2.isOld())
            return Integer.compare(o1.getTicketNumber(), o2.getTicketNumber());
        if (o1.isOld())
            return -1;
        if (o2.isOld())
            return 1;
        return Integer.compare(o1.getTicketNumber(), o2.getTicketNumber());
    }
}
