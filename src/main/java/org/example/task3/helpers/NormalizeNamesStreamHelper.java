package org.example.task3.helpers;

import java.util.*;
import java.util.stream.Collectors;

public class NormalizeNamesStreamHelper {
    public List<String> normalizeNamesStream(List<String> names) {
        return names.stream()
                .filter(Objects::nonNull)
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
