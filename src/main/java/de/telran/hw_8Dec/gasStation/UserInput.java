package de.telran.hw_8Dec.gasStation;

import java.util.Scanner;

public class UserInput {
    Scanner scan = new Scanner(System.in);

    public int getNum() {
        System.out.println("Enter your num: ");
        return scan.nextInt();
    }
}
