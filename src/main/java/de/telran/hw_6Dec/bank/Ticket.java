package de.telran.hw_6Dec.bank;

import java.time.LocalDateTime;
import java.util.Objects;

public class Ticket implements Comparable<Ticket> {
    private String firstName;
    private String secondName;
    private int yearOfBirth;
    private OperationType operationType;
    private int ticketNumber;

    public Ticket(String firstName, String secondName, int yearOfBirth, OperationType operationType) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.yearOfBirth = yearOfBirth;
        this.operationType = operationType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public boolean isOld() {
        return (LocalDateTime.now().getYear() - yearOfBirth) > 64;
    }
    public boolean isPriority() {
        return operationType == OperationType.DEPOSIT || operationType == OperationType.NEW_DEPOSIT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return ticketNumber == ticket.ticketNumber && Objects.equals(secondName, ticket.secondName) && operationType == ticket.operationType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(secondName, operationType, ticketNumber);
    }

    @Override
    public int compareTo(Ticket o) {
        return Integer.compare(ticketNumber, o.getTicketNumber());
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", operationType=" + operationType +
                ", ticketNumber=" + ticketNumber +
                '}';
    }
}
