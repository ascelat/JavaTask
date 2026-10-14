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
    public static List<String> p(List<String> l, int a) {
        List<String> r = new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {
            String s = l.get(i);
            if (s != null) {
                if (s.length() > a) {
                    if (s.contains("a")) {
                        r.add(s.toUpperCase());
                    }
                }
            }
        }
        return r;
    }

    public static int f(List<Integer> nums) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) != null) {
                if (nums.get(i) > 0) {
                    sum = sum + nums.get(i);
                }
            }
        }
        return sum;
    }

    public static Map<String, Integer> m(List<String> words) {
        Map<String, Integer> map = new HashMap<>();
        for (String w : words) {
            if (map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            } else {
                map.put(w, 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        List<String> test = Arrays.asList("apple", "banana", null, "avocado", "apricot", "x");
        List<String> result = p(test, 5);
        System.out.println(result);

        List<Integer> nums = Arrays.asList(1, -2, 3, null, 4, -5);
        System.out.println(f(nums));

        Map<String, Integer> freq = m(Arrays.asList("a", "b", "a", "c", "b", "a"));
        System.out.println(freq);
    }
}

