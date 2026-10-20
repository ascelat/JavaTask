package org.example.task3.helpers;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByLengthHelper {
    public Map<Integer, List<String>> groupByLength(List<String> words) {
        return words.stream()
                .collect(Collectors.groupingBy(String::length));
    }
}
