package org.example.task3.helpers;

import java.util.*;
import java.util.stream.Collectors;

public class TopNLongestHelper {
    public List<String> topNLongest(List<String> words, int n) {
        return words.stream()
                .sorted(Comparator
                        .comparingInt(String::length).reversed()
                        .thenComparing(Comparator.naturalOrder()))
                .limit(n)
                .collect(Collectors.toList());
    }
}
