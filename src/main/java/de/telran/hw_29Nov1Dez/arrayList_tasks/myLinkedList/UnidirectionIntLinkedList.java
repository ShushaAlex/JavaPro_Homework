package de.telran.hw_29Nov1Dez.arrayList_tasks.myLinkedList;

import java.util.Iterator;

public class UnidirectionIntLinkedList {
    private int size = 0;
    private MyNode first;
    private class MyNode {
        int item;
        MyNode next;
        MyNode(int data) {
            item = data;
            next = null;
        }
        @Override
        public String toString() {
            return "" + item;
        }
    }
    private class LinkedListIterator implements Iterator<Integer> {
        private MyNode current;

        LinkedListIterator() {
            current = first;
        }
        public Iterator<Integer> iterator() {
            return new LinkedListIterator();
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new IllegalStateException("Нет следующего элемента!");
            }
            int item = current.item;
            current = current.next;
            return item;
        }
    }
    public Iterator<Integer> iterator() {
        return new LinkedListIterator();
    }

    public int getSize() {
        return size;
    }

    public void addInt(int item) {
        MyNode newNode = new MyNode(item);
        if (first == null) {
            first = newNode;
        } else {
            MyNode temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }
    public void addInt(int index, int item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Недопустимый индекс!");
        }

        MyNode newNode = new MyNode(item);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            MyNode current = first;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }
    public void addFirst(int item) {
        addInt(0, item);
    }
    int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Недопустимый индекс!");
        }
        MyNode current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.item;
    }
    public void setInt(int index, int item) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Недопустимый индекс!");
        }
        MyNode current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.item = item;
    }
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Недопустимый индекс!");
        }
        MyNode current = first;
        if (index == 0) {
            first = current.next;
        } else {
            MyNode prev = null;
            for (int i = 0; i < index; i++) {
                prev = current;
                current = current.next;
            }
            prev.next = current.next;
        }
        size--;
    }
    public void removeFirst() {
        remove(0);
    }
    public void removeLast() {
        remove(size - 1);
    }
    public int indexOf(int item) {
        MyNode current = first;
        int index = 0;
        while (current != null) {
            if (current.item == item) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }
    public void clear() {
        first = null;
        size = 0;
    }

    public void showList() {
        MyNode current = first;
        while (current != null) {
            System.out.print(current.item + " ");
            current = current.next;
        }
        System.out.println();
    }
}
