package org.example.task3.helpers;

import java.util.*;

public class FindIntersectionHelper {
    public Set<Integer> findIntersection(List<Integer> first, List<Integer> second) {
        Set<Integer> result = new HashSet<>(first);
        result.retainAll(new HashSet<>(second));
        return result;
    }
}
