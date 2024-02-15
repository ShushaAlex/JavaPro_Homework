package de.telran.hw_14Feb.task1;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CatDemo {
    public static void main(String[] args) {
        Faker faker = new Faker();
        Random random = new Random();
        /*
           Создать 5-7 кошек
         */
        List<Cat> cats = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            Cat cat = new Cat(
                    faker.name().firstName(),
                    random.nextInt(15) + 1);
            cats.add(cat);
        }
        /*
            напечатайте в консоль вес созданных кошек
         */
        cats.forEach(cat -> System.out.println(cat.getWeight()));
        /*
            покормите 2 кошки и после этого распечатать их вес (убедитесь что вес изменился)
         */
        System.out.println("Weight before feeding first cat : " + cats.get(1).getWeight());
        cats.get(1).feed(0.4);
        System.out.println("Weight after feeding first cat : " + cats.get(1).getWeight());
        System.out.println("Weight before feeding second cat : " + cats.get(2).getWeight());
        cats.get(2).feed(0.5);
        System.out.println("Weight after feeding second cat : " + cats.get(2).getWeight());
        /*
            перекормите кошку
         */
        cats.getFirst().feed(100);
        System.out.println(cats.getFirst().getWeight());
        /*
            "замяукайте" кошку до смерти
         */
            cats.get(3).meow(13);


            cats.getFirst().sayMyInfo();

            Cat copiedCat = cats.getFirst().clone();
            copiedCat.sayMyInfo();

            copiedCat.setAge(20);

            cats.getFirst().sayMyInfo();
            copiedCat.sayMyInfo();


    }
}
