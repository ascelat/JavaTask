package org.example.task3.helpers;

import java.util.*;
import java.util.stream.Collectors;

public class AnalyzeEvenOddHelper {
    public Map<String, Double> analyzeEvenOdd(List<Integer> numbers) {
        Map<Boolean, IntSummaryStatistics> stats = numbers.stream()
                .collect(Collectors.partitioningBy(
                        n -> n % 2 == 0,
                        Collectors.summarizingInt(Integer::intValue)
                ));

        IntSummaryStatistics even = stats.get(true);
        IntSummaryStatistics odd = stats.get(false);

        return Map.of(
                "even_count", (double) even.getCount(),
                "even_sum", (double) even.getSum(),
                "even_avg", even.getAverage(),
                "odd_count", (double) odd.getCount(),
                "odd_sum", (double) odd.getSum(),
                "odd_avg", odd.getAverage()
        );
    }
}
