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
        System.out.print("Enter vertical coordinate: ");
        int x = scanner.nextInt();
        System.out.print("Enter horizontal coordinate: ");
        int y = scanner.nextInt();
        int[] coordinates = {x, y};
        if (!isCorrectCoordinates(coordinates)) {
            System.out.println("Coordinates can't be <= 0 or > 10. Please repeat your enter.");
            getCoordinates();
        }
        return coordinates;
    }

    public int[][] getCoordinates(int deckCount) {
        int[][] shipCoordinates = new int[deckCount][2];
        for (int i = 0; i < deckCount; i++) {
            boolean flag = false;
            while (flag == false) {
                System.out.print("Enter vertical coordinate: ");
                shipCoordinates[i][0] = scanner.nextInt();
                System.out.print("Enter horizontal coordinate: ");
                shipCoordinates[i][1] = scanner.nextInt();
                flag = isCorrectCoordinates(shipCoordinates[i]);
            }
        }
        return shipCoordinates;
    }

    private boolean isCorrectCoordinates(int[] coordinates) {
        boolean flag = false;
        if (coordinates[0] >= 1 && coordinates[0] < 11) {
            flag = true;
        } else {
            return false;
        }
        if (coordinates[1] >= 1 && coordinates[1] < 11) {
            flag = true;
        } else {
            return false;
        }
        return flag;
    }
}
