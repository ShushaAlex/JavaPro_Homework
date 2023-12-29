package de.telran.hw_20Dec;

import java.util.*;
import java.util.stream.Collectors;

public class SmallTasks {
    public static void main(String[] args) {
/*
Дан лист строк "BigBen", "BigBob", "Big", "Ben", "Big Bob".
Сколько раз объект «Big» встречается в коллекции?
 */
        List<String> strings = List.of("BigBen", "BigBob", "Big", "Ben", "Big Bob");
        long wordCount = strings.stream()
                .filter(s -> s.equals("Big"))
                .count();
        System.out.println(wordCount);
/*
Найти самый маленький элемент: Arrays.asList("a1", "b5", "a2", "b4")
*/
        List<String> strings1 = Arrays.asList("a1", "b5", "a2", "b4");
        Optional<String> minObj = strings1.stream()
                .min(Comparator.naturalOrder());
        String min = minObj.get();
        System.out.println(min);
/*
Выполнить сортировку в обратном алфавитном порядке и удалить дубликаты.
Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
*/
        List<String> strings2 = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
        Set<String> orderedStrings = strings2.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(orderedStrings);
    }

}
