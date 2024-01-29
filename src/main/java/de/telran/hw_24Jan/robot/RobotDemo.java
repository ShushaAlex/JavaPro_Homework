package de.telran.hw_24Jan.robot;

public class RobotDemo {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Producer producer = new Producer(robot, 3);
        Consumer consumer = new Consumer(robot, 3);
        Thread producerTr = new Thread(producer);
        Thread consumerTr = new Thread(consumer);
        producerTr.start();
        consumerTr.start();
    }
}
