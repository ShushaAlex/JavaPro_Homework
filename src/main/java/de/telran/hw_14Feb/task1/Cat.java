package de.telran.hw_14Feb.task1;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Cat implements Cloneable {
    @Getter
    private static int CATS_COUNT = 0;
    private static final int EYES_COUNT = 2;
    private static final double MIN_WEIGHT = 0.2;
    private static final double MAX_WEIGHT = 30.5;
    @Getter
    private final String name;
    @Getter
    @Setter
    private int age;
    @Getter
    @Setter
    private double weight;
    private int meowCounter = 0;
    @Getter
    private boolean isAlive = true;
    @Getter
    private double mealsSum = 0;
    private CatColor color;


    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = (double) age / 2;
        CATS_COUNT ++;
    }

    public void sayMyInfo() {
        System.out.println("My name is: " + name + ". I'm " + age + " years old. My weight is: " + weight + ".");
    }
    public void meow(int count) {
        for (int i = 0; i < count; i++) {
            if(meowCounter < 5) {
                System.out.println("meow");
                meowCounter++;
            } else {
                System.out.println("I can't meow anymore");
                isAlive = false;
                break;
            }
        }
    }
    public void feed(double foodAmount) {
        if (weight < ((double) age / 2) && (weight + foodAmount) < ((double) age / 2)) {
            weight += foodAmount;
            mealsSum += foodAmount;
        } else {
            System.out.println("You feed me too much, it's not healthy for me");
            isAlive = false;
        }
    }
    public void sleep() {
        System.out.println("I'm sleeping");
    }

    /*
    Создать в классе Cat метод, который будет возвращать сумму съеденной еды текущей кошки
     */
    public double getMeals() {
        return mealsSum;
    }
    /*
    Создать в классе Cat метод “сходить в туалет” pee(), который будет уменьшать вес кошки и что-нибудь печатать.
     */
    public void pee() {
        System.out.println("I'm peeing");
        weight -= 0.2;
    }

    @Override
    public Cat clone() {
        Cat newCat = new Cat(name, age);
        newCat.isAlive = this.isAlive;
        newCat.mealsSum = this.mealsSum;
        newCat.weight = this.weight;
        newCat.color = this.color;
        newCat.meowCounter = this.meowCounter;
        return newCat;
    }
}
