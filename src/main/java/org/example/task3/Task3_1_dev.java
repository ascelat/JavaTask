package org.example.task3;

import java.util.*;
import java.util.stream.*;

public class Task3_1_dev implements Task3_1{
    @Override 
    public List<Integer> filterAndMultiply(List<Integer> numbers){
        return numbers.stream()
            .filter(number -> number%2 == 0)
            .map(number -> number * 10)
            .collect(Collectors.toList());
    }

    @Override 
    public Map<String, Double> calculateStats(List<Integer> numbers){
        Map <String, Double> map = new HashMap<>();

        double Average = numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        double Sum = numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .sum();

        double Max = numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .max()
                .orElse(Double.NaN);
        
        double Min = numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .min()
                .orElse(Double.NaN);

        map.put("sum", Sum);
        map.put("average", Average);
        map.put("max", Max);
        map.put("Min", Min);

        return map;
    }

    @Override 
    public Map<Integer, List<String>> groupByLength(List<String> words){

        return words.stream().collect(Collectors.groupingBy(String::length));
    }

    @Override 
    public List<String> topNLongest(List<String> words, int n){
        return words.stream()
                .sorted()
                .limit(n)
                .toList();
    }

    @Override 
    public List<Integer> flattenAndSort(List<List<Integer>> nestedLists){
        return nestedLists.stream()
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .toList();
    }

    @Override 
    public Map<String, Double> analyzeEvenOdd(List<Integer> numbers){
        Map <String, Double> map = new HashMap<>();

        List<Integer> even = numbers.stream().filter(number -> number % 2 == 0 ).toList();
        List<Integer> odd = numbers.stream().filter(number -> number % 2 != 0).toList();

        Double even_count = (double)(even.stream().count());
        Double even_sum = even.stream().mapToDouble(Integer::doubleValue).sum();
        Double even_avg = even.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);

        Double odd_count = (double)(odd.stream().count());
        Double odd_sum = odd.stream().mapToDouble(Integer::doubleValue).sum();
        Double odd_avg = odd.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);

        map.put("even_count", even_count);
        map.put("even_sum", even_sum);
        map.put("even_avg", even_avg);

        map.put("odd_count", odd_count);
        map.put("odd_sum", odd_sum);
        map.put("odd_avg", odd_avg);

        return map;
    }

    @Override 
    public List<String> normalizeNamesStream(List<String> names){

        return names.stream().filter(Objects::nonNull).map(String::toUpperCase).map(String::trim).toList();
    }
}
