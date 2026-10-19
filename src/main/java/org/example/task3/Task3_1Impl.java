package org.example.task3;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Task3_1Impl implements Task3_1{
    @Override
    public List<Integer> filterAndMultiply(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 10)
                .collect(toList());
    }

    @Override
    public Map<String, Double> calculateStats(List<Integer> numbers) {
        Map<String, Double> result = new HashMap<>();
        double sum = numbers.stream().mapToInt(Integer::intValue).sum();
        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        double max = numbers.stream().mapToInt(Integer::intValue).max().orElse(0);
        double min = numbers.stream().mapToInt(Integer::intValue).min().orElse(0);

        result.put("sum", sum);
        result.put("average", average);
        result.put("max", max);
        result.put("min", min);

        return result;
    }

    @Override
    public Map<Integer, List<String>> groupByLength(List<String> words) {
        return words.stream().collect(Collectors.groupingBy(word -> word.length()));
    }

    @Override
    public List<String> topNLongest(List<String> words, int n) {
        return words.stream()
                .sorted(Comparator.comparingInt(String::length).reversed()
                        .thenComparing(Comparator.naturalOrder()))
                .limit(n)
                .collect(toList());
    }

    @Override
    public List<Integer> flattenAndSort(List<List<Integer>> nestedLists) {
        return nestedLists.stream()
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());
    }

    @Override
    public Map<String, Double> analyzeEvenOdd(List<Integer> numbers) {
        Map<Boolean, List<Integer>> myMap = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        List<Integer> even = myMap.get(true);
        List<Integer> odd = myMap.get(false);

        double evenCount = even.stream().count();
        double evenSum = even.stream().mapToDouble(Integer::doubleValue).sum();
        double evenAverage = even.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);

        double oddCount = odd.stream().count();
        double oddSum = odd.stream().mapToDouble(Integer::doubleValue).sum();
        double oddAverage = odd.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);

        Map<String, Double> result = new HashMap<>();
        result.put("even_count", evenCount);
        result.put("even_sum", evenSum);
        result.put("even_avg", evenAverage);
        result.put("odd_count", oddCount);
        result.put("odd_sum", oddSum);
        result.put("odd_avg", oddAverage);

        return result;
    }

    @Override
    public List<String> normalizeNamesStream(List<String> names) {
        return names.stream()
                 .filter(s -> s != null && !s.trim().isEmpty())
                 .map(s -> s.strip().toUpperCase(Locale.ROOT))
                 .collect(toList());
    }
}
