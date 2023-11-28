package de.telran.hw_27Nov.seaBattle.utiles;

import java.util.Scanner;

public class UserInput {
    Scanner scanner = new Scanner(System.in);
    public String getPlayerName() {
        System.out.println("Welcome to sea battle game!");
        System.out.print("May I get your name: ");
        String name = scanner.nextLine();
        System.out.println("Ok, " + name + ", thank you!");
        return name;
    }

    public int[] getCoordinates() {
        System.out.print("Enter horizontal coordinate: ");
        int x = scanner.nextInt();
        System.out.print("Enter vertical coordinate: ");
        int y = scanner.nextInt();
        return new int[] {x, y};
    }
}
