package de.telran.hw_27Nov.seaBattle;

import de.telran.hw_27Nov.seaBattle.utiles.UserInput;

public class User {
    UserInput ui = new UserInput();
    private String name;
    private String[][] field = {{"|_","|_","|_","|_","|_","|_","|_","|_","|_","|_"},
                                {"|_","|_","|_","|_","|_","|_","|_","|_","|_","|_"},
                                {"|_","|_","|_","|_","|_","|_","|_","|_","|_","|_"},
                                {"|_","|_","|_","|_","|_","|_","|_","|_","|_","|_"},
                                {"|_","|_","|_","|_","|_","|_","|_","|_","|_","|_"},
                                {"|_","|_","|_","|_","|_","|_","|_","|_","|_","|_"},
                                {"|_","|_","|_","|_","|_","|_","|_","|_","|_","|_"},
                                {"|_","|_","|_","|_","|_","|_","|_","|_","|_","|_"},
                                {"|_","|_","|_","|_","|_","|_","|_","|_","|_","|_"},
                                {"|_","|_","|_","|_","|_","|_","|_","|_","|_","|_"}};

    public User() {
        this.name = ui.getPlayerName();
    }

    public String getName() {
        return name;
    }

    public String[][] getField() {
        return field;
    }

    public void placeSingleDeckShips() {
        UserInput ui = new UserInput();
        int[] ship1 = ui.getCoordinates();
        if (isRightCoordinates(ship1)) {
            placeShip(ship1);
        } else {
            System.out.println("You entered incorrect coordinates, please repeat your enter.");
            placeSingleDeckShips();
        }
    }

    private void placeShip(int[] ship1) {
        field[ship1[0] - 1][ship1[1] - 1] = "|X";
    }

    private boolean isRightCoordinates(int[] coordinates) {
        boolean flag = false;
        if (coordinates[0] >= 1 && coordinates[0] <= 10) {
            flag = true;
        } else {
            return false;
        }
        if (coordinates[1] > 1 && coordinates[1] < 11) {
            flag = true;
        } else {
            return false;
        }
        return flag;
    }
}
