package org.example.task3.helpers;

import java.util.*;

public class FindMostFrequentHelper {
    public int findMostFrequent(List<Integer> numbers) {
        Map<Integer, Integer> counts = new HashMap<>();

        for (Integer number : numbers) {
            counts.merge(number, 1, Integer::sum);
        }

        int bestNumber = numbers.get(0);
        int bestCount = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            int number = entry.getKey();
            int count = entry.getValue();

            if (count > bestCount || (count == bestCount && number < bestNumber)) {
                bestCount = count;
                bestNumber = number;
            }
        }

        return bestNumber;
    }
}
