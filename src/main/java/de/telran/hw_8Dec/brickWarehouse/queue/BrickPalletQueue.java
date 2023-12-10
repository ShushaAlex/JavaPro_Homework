package de.telran.hw_8Dec.brickWarehouse.queue;

import de.telran.hw_8Dec.brickWarehouse.BrickPallet;

import java.util.LinkedList;
import java.util.Queue;

public class BrickPalletQueue {
    public static void upLoadPallets(Queue<BrickPallet> pallets, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(pallets.poll());
        }
    }
    public static void loadPallets(Queue<BrickPallet> pallets, int count) {
        for (int i = 0; i < count; i++) {
            pallets.add(new BrickPallet());
        }
    }
    public static void main(String[] args) {
        // создаем стек паллет с кирпичами и
        Queue<BrickPallet> pallets = new LinkedList<>();
        //заполняем его
        loadPallets(pallets, 10);
        //разгружаем его
        System.out.println("Upload");
        upLoadPallets(pallets, 3);

        loadPallets(pallets, 2);
        System.out.println("Upload");
        upLoadPallets(pallets, 4);

    }
}
