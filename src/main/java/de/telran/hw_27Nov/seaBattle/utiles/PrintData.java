package de.telran.hw_27Nov.seaBattle.utiles;

public class PrintData {
    public void printField(String[][] arr) {
        for (String[] row : arr) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}