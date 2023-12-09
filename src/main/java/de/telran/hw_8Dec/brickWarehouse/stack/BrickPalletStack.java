package de.telran.hw_8Dec.brickWarehouse.stack;

import de.telran.hw_8Dec.brickWarehouse.BrickPallet;

import java.util.Stack;

public class BrickPalletStack {
    public static void upLoadPallets(Stack<BrickPallet> pallets, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(pallets.pop());
        }
    }
    public static void loadPallets(Stack<BrickPallet> pallets, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(pallets.push(new BrickPallet()));
        }
    }
    public static void main(String[] args) {
        // создаем стек паллет с кирпичами и
        Stack<BrickPallet> pallets = new Stack<>();
        //заполняем его
        System.out.println("Load");
        loadPallets(pallets, 10);
        //разгружаем его
        System.out.println("Upload");
        upLoadPallets(pallets, 3);
        System.out.println("Load");
        loadPallets(pallets, 2);
        System.out.println("Upload");
        upLoadPallets(pallets, 4);

    }
}
