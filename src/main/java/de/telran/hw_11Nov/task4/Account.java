package de.telran.hw_11Nov.task4;

import java.time.LocalDate;

public class Account {
    private String accountNumber;
    private String accountOwner;
    private String status;
    private double balance;
    private LocalDate openingDate;
    private LocalDate closingDate;

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public String getStatus() {
        return status;
    }

    public double getBalance() {
        return balance;
    }

    public LocalDate getOpeningDate() {
        return openingDate;
    }

    public LocalDate getClosingDate() {
        return closingDate;
    }

    public void setAccountNumber(String accountNumber) {
        boolean isO = false;
        for (int i = 0; i < accountNumber.length(); i++) {
            if (accountNumber.charAt(i) == '0') {
                isO = true;
            }
        }
        if (accountNumber.length() == 16 && !isO) {
            this.accountNumber = accountNumber;
            System.out.println(accountNumber);
        } else {
            System.out.println("Incorrect account number");
        }
    }

    void closeAccount(LocalDate closingDate) {
        if (closingDate.compareTo(this.openingDate) == 1) {
            this.closingDate = closingDate;
            System.out.println("Your account is closed");
        } else {
            System.out.println("Opening date can't be greater than closing date");
        }
    }

    void deposit(double sum) {

    }

    void withdraw(double sum) {

    }
}
