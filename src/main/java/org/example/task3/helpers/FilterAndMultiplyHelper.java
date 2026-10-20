package org.example.task3.helpers;

import java.util.*;
import java.util.stream.Collectors;

public class FilterAndMultiplyHelper {
    public List<Integer> filterAndMultiply(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 10)
                .collect(Collectors.toList());
    }
}
