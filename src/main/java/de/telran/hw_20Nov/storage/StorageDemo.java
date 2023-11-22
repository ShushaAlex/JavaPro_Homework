package de.telran.hw_20Nov.storage;

import de.telran.hw_20Nov.storage.interfaces.Assembler;
import de.telran.hw_20Nov.storage.interfaces.Loader;
import de.telran.hw_20Nov.storage.interfaces.Warehouseman;

/*
Вы работаете на складе. Когда приезжает товар, у вас:
Грузчик: Разгружает товар, Загружает товар.
Кладовщик: Принимает товар, отпускает товар, Определяет место (ячейку) для хранения товара,
Формирует задание на сборку товара со склада, Формирует задание на размещение товара на складе.
Сборщик: Размещает товар на складе, Собирает товар на складе.
Реализовать складскую работу на складе, согласно вышеуказанного поведения.
 */
public class StorageDemo {
    public static void main(String[] args) {
        Assembler assembler = new Storage();
        Loader loader = new Storage();
        Warehouseman warehouseman = new Storage();

        assembler.assembleProducts();
        assembler.placeProducts();

        loader.loadProduct();
        loader.uploadProduct();

        warehouseman.generateAssemblingProdTask();
        warehouseman.sendProducts();
        warehouseman.determinePlaceOfProd();
        warehouseman.receiveProducts();
        warehouseman.generatePlacingProdTask();
    }
}
