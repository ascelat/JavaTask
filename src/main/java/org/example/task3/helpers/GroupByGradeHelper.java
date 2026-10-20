package org.example.task3.helpers;

import java.util.*;

public class GroupByGradeHelper {
    public Map<Integer, List<String>> groupByGrade(Map<String, Integer> students) {
        Map<Integer, List<String>> result = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            Integer grade = entry.getValue();
            List<String> names = result.computeIfAbsent(grade, k -> new ArrayList<>());

            names.add(entry.getKey());
        }

        return result;
    }

}
