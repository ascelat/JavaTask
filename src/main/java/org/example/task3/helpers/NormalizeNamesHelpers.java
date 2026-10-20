package org.example.task3.helpers;

import java.util.*;

public class NormalizeNamesHelpers {
    public List<String> normalizeNames(List<String> names) {
        List<String> result = new ArrayList<>();

        for (String name : names) {
            if (name == null) {
                continue;
            }

            String trimmed = name.trim();

            if (trimmed.isEmpty()) {
                continue;
            }

            result.add(trimmed.toUpperCase());
        }

        return result;
    }
}
