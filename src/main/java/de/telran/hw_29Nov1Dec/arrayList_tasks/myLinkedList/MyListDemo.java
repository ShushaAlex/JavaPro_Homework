package de.telran.hw_29Nov1Dec.arrayList_tasks.myLinkedList;

import java.util.Iterator;

public class MyListDemo {
    public static void main(String[] args) {
        UnidirectionIntLinkedList unidirectionIntLinkedList = new UnidirectionIntLinkedList();
        unidirectionIntLinkedList.addInt(20);
        unidirectionIntLinkedList.addFirst(10);
        unidirectionIntLinkedList.addInt(30);
        unidirectionIntLinkedList.addInt(40);
//        unidirectionIntLinkedList.removeFirst();
//        unidirectionIntLinkedList.clear();
        unidirectionIntLinkedList.remove(0);
        unidirectionIntLinkedList.showList();
        Iterator<Integer> iterator = unidirectionIntLinkedList.iterator();

        while (iterator.hasNext()) {
            int elem = iterator.next();
            System.out.println(elem);
        }
    }
}
