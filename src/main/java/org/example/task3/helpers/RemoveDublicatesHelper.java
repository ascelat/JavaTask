package org.example.task3.helpers;

import java.util.*;

public class RemoveDublicatesHelper {
    public List<Integer> removeDuplicates(List<Integer> numbers) {
        return new ArrayList<>(new LinkedHashSet<>(numbers));
    }
}
