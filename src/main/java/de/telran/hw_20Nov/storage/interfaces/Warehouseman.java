package de.telran.hw_20Nov.storage.interfaces;

public interface Warehouseman {
    void receiveProducts();
    void sendProducts();
    void determinePlaceOfProd();
    void generateAssemblingProdTask();
    void generatePlacingProdTask();
}
