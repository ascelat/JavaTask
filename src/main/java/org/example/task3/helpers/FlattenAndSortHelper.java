package org.example.task3.helpers;

import java.util.*;
import java.util.stream.Collectors;

public class FlattenAndSortHelper {
    public List<Integer> flattenAndSort(List<List<Integer>> nestedLists) {
        return nestedLists.stream()
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
