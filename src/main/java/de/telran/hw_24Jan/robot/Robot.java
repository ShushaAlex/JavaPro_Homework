package de.telran.hw_24Jan.robot;

public class Robot {
    private int detail = 0;

    public synchronized void putDetail() {
        while (detail >= 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Robot-1 puts detail on the desk");
        detail++;
        notify();
    }

    public synchronized void getDetail() {
        while ( detail <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Robot-2 gets detail from the desk");
        detail--;
        notify();
    }
}

class Producer implements Runnable {
    Robot robot;
    int detailCount;

    public Producer(Robot robot, int detailCount) {
        this.robot = robot;
        this.detailCount = detailCount;
    }

    @Override
    public void run() {
        for (int i = 0; i < detailCount; i++) {
            robot.putDetail();
        }
    }
}

class Consumer implements Runnable {
    Robot robot;
    int detailCount;

    public Consumer(Robot robot, int detailCount) {
        this.robot = robot;
        this.detailCount = detailCount;
    }

    @Override
    public void run() {
        for (int i = 0; i < detailCount; i++) {
            robot.getDetail();
        }
    }
}
