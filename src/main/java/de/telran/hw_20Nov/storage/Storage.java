package de.telran.hw_20Nov.storage;

import de.telran.hw_20Nov.storage.interfaces.Assembler;
import de.telran.hw_20Nov.storage.interfaces.Loader;
import de.telran.hw_20Nov.storage.interfaces.Warehouseman;

public class Storage implements Loader, Warehouseman, Assembler {
    @Override
    public void placeProducts() {
        System.out.println("Products are placed");
    }

    @Override
    public void assembleProducts() {
        System.out.println("Products are assembled");
    }

    @Override
    public void loadProduct() {
        System.out.println("Products are loaded");
    }

    @Override
    public void uploadProduct() {
        System.out.println("Products are uploaded");
    }

    @Override
    public void receiveProducts() {
        System.out.println("Products are received");
    }

    @Override
    public void sendProducts() {
        System.out.println("Products are sent");
    }

    @Override
    public void determinePlaceOfProd() {
        System.out.println("Storage places are determined");
    }

    @Override
    public void generateAssemblingProdTask() {
        System.out.println("Assembling task is generated");
    }

    @Override
    public void generatePlacingProdTask() {
        System.out.println("Task for placing products is generated");
    }
}
