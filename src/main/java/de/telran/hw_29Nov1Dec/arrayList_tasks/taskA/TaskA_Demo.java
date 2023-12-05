package de.telran.hw_29Nov1Dec.arrayList_tasks.taskA;

import de.telran.hw_20Nov.henFactory.Hen;
import de.telran.hw_20Nov.henFactory.henTypes.BelarusianHen;
import de.telran.hw_20Nov.henFactory.henTypes.MoldovanHen;
import de.telran.hw_29Nov1Dec.arrayList_tasks.taskC.TaskC;
import de.telran.hw_29Nov1Dec.arrayList_tasks.taskD.TaskD;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TaskA_Demo {
    public static void main(String[] args) {
        TaskC taskC = new TaskC();
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(11);
        arrayList.add(0);

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(12);
        linkedList.add(13);
        linkedList.add(110);
        linkedList.add(10);

        List<String> linkedStrList = new LinkedList<>();
        linkedStrList.add("Hello");
        linkedStrList.add("hi");
        linkedStrList.add("Hallo");
        linkedStrList.add("hola");
        linkedStrList.add("buy");

        List<Hen> hens = new ArrayList<>();
        hens.add(new MoldovanHen(12));
        hens.add(new BelarusianHen(4));
        hens.add(new MoldovanHen(13));

//        System.out.println("Найти сумму всех элементов ArrayList " + TaskA.calcSumOfElements(arrayList));
//        System.out.println("Найти среднее значение элементов LinkedList " + TaskA.calcAverage(linkedList));
//        System.out.print("Перебрать ArrayList и вывести все элементы на экран. ");
//        TaskA.showEveryElement(linkedList);
//        System.out.println("Перебрать LinkedList и найти самую длинную строку. " + TaskA.getLongestString(linkedStrList));
//        System.out.println("Создать ArrayList с объектами вашего собственного класса и вывести их на экран. ");
//        TaskA.showEveryObjElement(hens);

        TaskD.replaceVowels(linkedStrList);
        System.out.println(linkedStrList);

    }
}
