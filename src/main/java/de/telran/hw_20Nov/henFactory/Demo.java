package de.telran.hw_20Nov.henFactory;
import de.telran.hw_20Nov.henFactory.henTypes.BelarusianHen;
import de.telran.hw_20Nov.henFactory.henTypes.MoldovanHen;
import de.telran.hw_20Nov.henFactory.henTypes.RussianHen;
import de.telran.hw_20Nov.henFactory.henTypes.UkrainianHen;
/*
Создать класс Hen
1.1. Сделать его абстрактным
1.2. Добавить в класс абстрактный метод  int getCountOfEggsPerMonth()
1.3. Добавить в класс метод String getDescription(), который возвращает строку "Я курица."
Создать класс RussianHen, который наследуется от Hen
Создать класс UkrainianHen, который наследуется от Hen
Создать класс MoldovanHen, который наследуется от Hen
Создать класс BelarusianHen, который наследуется от Hen
В каждом из четырех последних классов написать свою реализацию метода getCountOfEggsPerMonth.
Методы должны возвращать количество яиц в месяц от данного типа куриц.
В каждом из четырех последних классов написать свою реализацию метода getDescription.
Методы должны возвращать строку вида:
  + <" Моя страна - SSSSS. Я несу N яиц в месяц.">
где SSSSS - название страны
где N - количество яиц в месяц
В классе HenFactory реализовать меетод getHen, который возвращает соответствующую стране породу кур
Все созданные вами классы должны быть в отдельных файлах
 */
public class Demo {
    public static void main(String[] args) {
        HenFactory henFactory = new HenFactory();
        Hen newHen = henFactory.getHen("Ukraine");
        System.out.println(newHen);

        System.out.println(newHen.getCountOfEggsPerMonth());
        System.out.println(newHen.getDescription());
    }
}
