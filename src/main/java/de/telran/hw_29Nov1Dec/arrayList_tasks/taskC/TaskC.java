package de.telran.hw_29Nov1Dec.arrayList_tasks.taskC;

import java.util.List;

public class TaskC {
    /*
    Перебрать ArrayList и удалить все четные числа.
    Перебрать LinkedList и заменить все элементы, кратные 3, на нули.
    Перебрать ArrayList и объединить все элементы в одну строку.
    Перебрать LinkedList и удалить все элементы, содержащие определенную подстроку.
    Создать ArrayList с объектами вашего собственного класса и вывести только те, которые удовлетворяют определенному условию.
     */
    public static void removeEvenNum(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0) {
                list.remove(list.get(i));
            }
        }
    }
    public static void replaceTo0(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0) {
                list.set(i, 0);
            }
        }
    }
    public static String uniteToStr(List<String> list) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String s : list) {
            stringBuffer.append(s);
        }
        return String.valueOf(stringBuffer);
    }
    public static void removeElemsWithSubstr(List<String> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).contains(str)) {
                list.remove(i);
            }
        }
    }

}
