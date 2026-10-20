package org.example.task3.helpers;

import java.util.*;

public class SumOfLengthsHelper {
    public int sumOfLengths(List<String> words) {
        int sum = 0;

        for (String word : words) {
            if (word != null) {
                sum += word.length();
            }
        }

        return sum;
    }
}
