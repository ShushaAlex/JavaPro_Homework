package de.telran.hw_26Feb;

import java.util.Scanner;

/**
 * Есть Магазин, на котором может одновременно разместиться ограниченное количество товара (для примера можно взять 3 единицы, а лучше попросить пользователя ввести количество).
 * За один раз Поставщик может привезти 1 шт. товара.
 * Покупатель тоже может приобрести только 1 шт. товара.
 * Напишите программу, которая позволит Покупателям приобретать товар и нужно сделать так, чтобы полки магазина не пустовали ;)
 * Используйте wait / notify механизм многопоточности. Поставщик и Покупатель/ли - это разные потоки.
 */
public class ShopDemo {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Thread customer = new Customer(shop);
        Thread seller = new Seller(shop);
    }
}
class Shop {
    private int maxItemsCount;
    private int itemsCount;
    public Shop() {
        System.out.print("Enter max count of items on the shelf: ");
        this.maxItemsCount = new Scanner(System.in).nextInt();
        this.itemsCount = this.maxItemsCount;
    }
    public synchronized void putItems() {
        while (itemsCount >= maxItemsCount) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        itemsCount++;
        System.out.println("Seller: There are " + itemsCount + " items on the shelf");
        notify();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public synchronized void buyItems() {
        while (itemsCount < 2) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        itemsCount--;
        System.out.println("Customer: There are " + itemsCount + " items on the shelf");
        notify();
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class Customer extends Thread {
    Shop shop;

    public Customer(Shop shop) {
        this.shop = shop;
        this.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            shop.buyItems();
        }
    }
}
class Seller extends Thread {
    Shop shop;

    public Seller(Shop shop) {
        this.shop = shop;
        this.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            shop.putItems();
        }
    }
}
