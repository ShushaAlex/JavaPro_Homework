package de.telran.hw_11Nov.task3;

import java.util.Scanner;

public class Service {
    Scanner scanner = new Scanner(System.in);

    protected int getBoxWidth() {
        System.out.print("Enter width of the box: ");
        return scanner.nextInt();
    }
    protected int getBoxLength() {
        System.out.print("Enter length of the box: ");
        return scanner.nextInt();
    }
    protected int getBoxHeight() {
        System.out.print("Enter height of the box: ");
        return scanner.nextInt();
    }
    protected int getProdVolume() {
        System.out.print("Enter volume of the product: ");
        return scanner.nextInt();
    }

    protected void showResultOfCalc(int prodVolume, int boxCount, int restProdVolume) {
        System.out.println("For " + prodVolume + " you need " + boxCount + " boxes. After packaging the goods there will be " +restProdVolume + " cubic centimeter left");
    }
}
