package de.telran.hw_29Jan;

import lombok.Getter;

import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * На соревнованиях 5 спортсменов начинают одновременно стрелять в одну мишень.
 * Если кто-нибудь в нее попадает(сделать Random-но), то мишень разрушается и другие в нее уже попасть не могут,
 * но что-то пошло не так. Исправь программу, чтобы другие потоки "видели"
 * изменения значения переменной isHit и больше его не меняли. Как только мишень разрушена кем то из стрелков,
 * соревнования прекращаются. Воспользуйся классом AtomicBoolean и его методами.
 */

public class TargetDemo {
    public static void main(String[] args) {
        Target target = new Target();

        for (int i = 0; i < 5; i++) {
            Thread thread = new Player(target);
        }
    }
}
class Target {
    Random random = new Random();
    @Getter
    private AtomicBoolean isHit = new AtomicBoolean();

    public void shoot() {
            int shoot = random.nextInt(5);
            if (shoot == 2) {
                isHit.getAndSet(true);
                System.out.println(Thread.currentThread().getName() + ": Win!!!");
            } else {
                System.out.println(Thread.currentThread().getName() + ": Missed");
            }
    }
}

class Player extends Thread {
    private final Target target;

    public Player(Target target) {
        this.target = target;
        this.start();
    }

    @Override
    public void run() {
        while (!target.getIsHit().get()) {
            target.shoot();
        }
    }
}

