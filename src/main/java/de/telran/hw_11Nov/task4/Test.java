package de.telran.hw_11Nov.task4;

import java.time.LocalDate;

public class Test {

    private LocalDate closingDate;
    private LocalDate openingDate;

    void closeAccount(LocalDate closingDate) {
        if (closingDate.compareTo(this.openingDate) == 1) {
            this.closingDate = closingDate;
            System.out.println("Your account is closed");
        } else {
            System.out.println("Opening date can't be greater than closing date");
        }
    }
    public static void main(String[] args) {

        Test test = new Test();
        test.openingDate = LocalDate.of(2023, 11, 14);
        test.closeAccount(LocalDate.of(2023, 11, 13));
    }
}
