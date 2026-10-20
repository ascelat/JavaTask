package org.example.task3.helpers;

import java.util.*;

public class CalculateStatsHelper {
    public Map<String, Double> calculateStats(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return Map.of();
        }

        IntSummaryStatistics stats = numbers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        return Map.of(
                "sum", (double) stats.getSum(),
                "average", stats.getAverage(),
                "max", (double) stats.getMax(),
                "min", (double) stats.getMin()
        );
    }
}
