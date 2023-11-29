package de.telran.hw_27Nov.seaBattle;
import de.telran.hw_27Nov.seaBattle.utiles.PrintData;

public class GameDemo {
    public static void main(String[] args) {
        User user1 = new User();
        PrintData printData = new PrintData();
        printData.printField(user1.getUserField());
        user1.placeShips(2, 2);
        printData.printField(user1.getUserField());

    }
}
