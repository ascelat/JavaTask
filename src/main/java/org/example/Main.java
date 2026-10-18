package org.example;

import org.example.task3.Task3Impl;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Task3Impl t3 = new Task3Impl();

        // 1. Убираем дубликаты
        List<Integer> dupes = Arrays.asList(1, 2, 2, 3, 1);
        System.out.println("Было: " + dupes);
        System.out.println("Стало: " + t3.removeDuplicates(dupes));
        System.out.println();

        // 2. Пересечение множеств
        List<Integer> list1 = Arrays.asList(1, 2, 2, 3);
        List<Integer> list2 = Arrays.asList(2, 3, 4);
        System.out.println("Список 1: " + list1);
        System.out.println("Список 2: " + list2);
        System.out.println("Общее: " + t3.findIntersection(list1, list2));
        System.out.println();

        // 3. Подсчет слов
        List<String> words = Arrays.asList("java", "python", "java");
        System.out.println("Результат: " + t3.countWords(words));
        System.out.println();

        // 4. Группировка по оценкам
        Map<String, Integer> students = new HashMap<>();
        students.put("Аня", 5);
        students.put("Боря", 4);
        students.put("Вера", 5);
        System.out.println("Результат: " + t3.groupByGrade(students));
        System.out.println();

        // 5. Самый частый элемент
        List<Integer> freqList = Arrays.asList(5, 4, 3, 2, 1, 1, 3);
        System.out.println("Список: " + freqList);
        System.out.println("Результат: " + t3.findMostFrequent(freqList));
        System.out.println();

        // 6. Сумма длин
        List<String> wordsWithNull = Arrays.asList("java", null, "is", "cool");
        System.out.println("Список: " + wordsWithNull);
        System.out.println("Сумма длин: " + t3.sumOfLengths(wordsWithNull));
        System.out.println();

        // 7. Нормализация имен
        List<String> badNames = Arrays.asList(" аня ", "", null, "боря");
        System.out.println("Было: " + badNames);
        System.out.println("Стало: " + t3.normalizeNames(badNames));
        System.out.println();
    }
}