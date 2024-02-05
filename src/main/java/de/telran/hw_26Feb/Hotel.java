package de.telran.hw_26Feb;

/**
 * Вы въезжаете в отель и подходите к стойке администратора. За стойкой никого нет, но на ней стоит звоночек,
 * используя который Вы можете позвать администратора. Т.к. наплыв гостей очень редко бывает большим,
 * чтобы организовывалась очередь, администратор обычно "уходит по своим делам", обслужив Вас и ждет следующего звонка.
 * Напишите программу, которая автоматизирует данный процесс обслуживания. Гость и Администратор - отдельные потоки приложения.
 * Используйте wait / notify механизмы многопоточности.
 */
public class Hotel {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread guest = new Guest(counter);
        Thread host = new Host(counter);
    }
}
class Counter {
    synchronized void getKey() {
            try {
                System.out.println("Hello, is anybody here?");
                notify();
                wait();
                System.out.println("I would like to have my key");
                notify();
                wait();
                System.out.println("Thank you!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }
    synchronized void giveKey() {
        try {
            System.out.println("Hello, how can I help you?");
            notify();
            wait();
            System.out.println("Sure, here is your key");
            notify();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
class Guest extends Thread {
    Counter counter;

    public Guest(Counter counter) {
        this.counter = counter;
        this.start();
    }
    public void run() {
        counter.getKey();
        interrupt();
    }
}
class Host extends Thread {
    Counter counter;

    public Host(Counter counter) {
        this.counter = counter;
        this.start();
    }
    public void run() {
        counter.giveKey();
    }
}
