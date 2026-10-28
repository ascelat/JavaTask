package org.example.task4;

import java.util.*;

/**
 * ТУТ НАДО СДЕЛАТЬ КОД РЕВЬЮ.
 * НЕОБХОДИОМО ИСПРАВИТЬ НА ВАШЕ УСМОТРЕНИЕ ФРАГМЕНТЫ КОДА, СИГНАТУРУ МЕТОДА,
 * ПАРАМЕТРЫ, ЛОГИКУ РАБОТЫ БЛОКОВ КОДА.
 * КОРОЧЕ ГДЕ ПОСЧИТАЕТЕ ОШИБКУ ИЛИ НЕТОЧНОСТЬ, ИЛИ ГДЕ МОЖНО
 * ЛУЧШЕ ИСПРАВЬТЕ НА ВАШЕ УСМОТРЕНИЕ. ЕСЛИ ЧЕГО-ТО НЕ ХВАТАЕТ, ТО МОЖНО ДОБАВИТЬ
 * _________
 * <p>
 * ДАННОЕ ЗАДАНИЕ ДЕЛАТЬ МОЖНО ПОЖЕЛАНИЮ
 */
public class Task4 {
    public static List<String> filterAndToUpperCase(List<String> words, int minLength) {
        if (words == null || words.isEmpty()) {
            return Collections.emptyList();
        }

        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (word != null && word.length() > minLength && word.contains("a")) {
                result.add(word.toUpperCase());
            }
        }
        return result;
    }

    public static int sumPositiveNumbers(List<Integer> numbers) {
        if (numbers == null) {
            return 0;
        }

        int sum = 0;
        for (Integer num : numbers) {
            if (num != null && num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static Map<String, Integer> countWordFrequency(List<String> words) {
        if (words == null || words.isEmpty()) {
            return Collections.emptyMap();
        }

        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            if (word != null) {
                frequencyMap.merge(word, 1, Integer::sum);
            }
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        List<String> testStrings = Arrays.asList("apple", "banana", null, "avocado", "apricot", "x");
        List<String> result = filterAndToUpperCase(testStrings, 5);
        System.out.println(result);

        List<Integer> nums = Arrays.asList(1, -2, 3, null, 4, -5);
        System.out.println(sumPositiveNumbers(nums));

        Map<String, Integer> freq = countWordFrequency(Arrays.asList("a", "b", "a", "c", "b", "a"));
        System.out.println(freq);
    }
}