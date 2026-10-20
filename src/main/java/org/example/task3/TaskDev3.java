package org.example.task3;

import org.example.task3.helpers.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class TaskDev3 implements Task3 {
    private final RemoveDublicatesHelper remDupServ = new RemoveDublicatesHelper();
    private final FindIntersectionHelper findInterServ = new FindIntersectionHelper();
    private final CountWordsHelper countWordsServ = new CountWordsHelper();
    private final GroupByGradeHelper groupByGradeServ = new GroupByGradeHelper();
    private final FindMostFrequentHelper findMostFreqServ = new FindMostFrequentHelper();
    private final CompareSetsHelper compareSetsServ = new CompareSetsHelper();
    private final SumOfLengthsHelper sumOfLengthsServ = new SumOfLengthsHelper();
    private final NormalizeNamesHelpers normalizeNamesServ = new NormalizeNamesHelpers();

    @Override
    public List<Integer> removeDuplicates(List<Integer> numbers) {
        return remDupServ.removeDuplicates(numbers);
    }

    @Override
    public Set<Integer> findIntersection(List<Integer> first, List<Integer> second) {
        return findInterServ.findIntersection(first, second);
    }

    @Override
    public Map<String, Integer> countWords(List<String> words) {
        return countWordsServ.countWords(words);
    }

    @Override
    public Map<Integer, List<String>> groupByGrade(Map<String, Integer> students) {
        return groupByGradeServ.groupByGrade(students);
    }

    @Override
    public int findMostFrequent(List<Integer> numbers) {
        return findMostFreqServ.findMostFrequent(numbers);
    }

    @Override
    public Map<String, Object> compareSets(Set<String> first, Set<String> second) {
        return compareSetsServ.compareSets(first, second);
    }

    @Override
    public int sumOfLengths(List<String> words) {
        return sumOfLengthsServ.sumOfLengths(words);
    }

    @Override
    public List<String> normalizeNames(List<String> names) {
        return normalizeNamesServ.normalizeNames(names);
    }
}
