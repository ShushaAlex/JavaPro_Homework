package de.telran.hw_27Nov.seaBattle;

import de.telran.hw_27Nov.seaBattle.utiles.UserInput;

public class User {
    UserInput ui = new UserInput();
    private String name;
    private String[][] userField = {{"|_","|_","|_","|_","|_","|_","|_","|_","|_","|_"},
                                {"|_","|_","|_","|_","|_","|_","|_","|_","|_","|_"},
                                {"|_","|_","|_","|_","|_","|_","|_","|_","|_","|_"},
                                {"|_","|_","|_","|_","|_","|_","|_","|_","|_","|_"},
                                {"|_","|_","|_","|_","|_","|_","|_","|_","|_","|_"},
                                {"|_","|_","|_","|_","|_","|_","|_","|_","|_","|_"},
                                {"|_","|_","|_","|_","|_","|_","|_","|_","|_","|_"},
                                {"|_","|_","|_","|_","|_","|_","|_","|_","|_","|_"},
                                {"|_","|_","|_","|_","|_","|_","|_","|_","|_","|_"},
                                {"|_","|_","|_","|_","|_","|_","|_","|_","|_","|_"}};
    private String[][] battleField = {{"|_","|_","|_","|_","|_","|_","|_","|_","|_","|_"},
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

    public String[][] getUserField() {
        return userField;
    }

    public void placeSingleDeckShips() {
        for (int i = 0; i < 4; i++) {
            int[] ship = ui.getCoordinates();
            if (isFreeCells(ship)) {
                placeShip(ship);
            } else {
                System.out.println("Thees cells are taken, please repeat your enter.");
                placeSingleDeckShips();
            }
        }
    }
    public void placeShips(int deckCount, int shipsCount) {
        for (int j = 0; j < shipsCount; j++) {
            int[][] ship = ui.getCoordinates(deckCount);
            for (int i = 0; i < deckCount; i++) {
                placeShip(ship[i]);
            }
        }
    }
    private void placeShip(int[] ship) {
        userField[ship[0] - 1][ship[1] - 1] = "|X";
    }

    private boolean isFreeCells(int[] coordinates) {
        return !(userField[coordinates[0] - 1][coordinates[1] - 1].equals("|X"));
    }
    private boolean isFreeCells(int[][] coordinates) {
        boolean flag = false;
        for (int[] coordinate : coordinates) {
            if (userField[coordinate[0] - 1][coordinate[1] - 1] == "|X") {
                return false;
            } else {
                flag = true;
            }
        }
        return flag;
    }

}
