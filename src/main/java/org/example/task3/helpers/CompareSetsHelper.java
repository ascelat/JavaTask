package org.example.task3.helpers;

import java.util.*;

public class CompareSetsHelper {
    public Map<String, Object> compareSets(Set<String> first, Set<String> second) {
        Set<String> union = new LinkedHashSet<>(first);
        union.addAll(second);

        Set<String> intersection = new LinkedHashSet<>(first);
        intersection.retainAll(second);

        Set<String> difference = new LinkedHashSet<>(first);
        difference.removeAll(second);

        boolean isSubset = second.containsAll(first);

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("union", union);
        result.put("intersection", intersection);
        result.put("difference", difference);
        result.put("isSubset", isSubset);

        return result;
    }
}
