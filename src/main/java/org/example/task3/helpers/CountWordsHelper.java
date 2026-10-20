package org.example.task3.helpers;

import java.util.*;

public class CountWordsHelper {
    public Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> result = new LinkedHashMap<>();

        for (String word : words) {
            if (word == null) {
                continue;
            }
            result.merge(word, 1, Integer::sum);
        }

        return result;
    }
}
