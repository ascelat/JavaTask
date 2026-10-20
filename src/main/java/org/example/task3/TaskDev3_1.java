package org.example.task3;

import org.example.task3.helpers.*;

import java.util.*;

public class TaskDev3_1 implements Task3_1{
    private final FilterAndMultiplyHelper filAndMultServ = new FilterAndMultiplyHelper();
    private final CalculateStatsHelper calcStatsServ = new CalculateStatsHelper();
    private final GroupByLengthHelper groupByLengthServ = new GroupByLengthHelper();
    private final TopNLongestHelper topNLongServ = new TopNLongestHelper();
    private final FlattenAndSortHelper flatAndSortServ = new FlattenAndSortHelper();
    private final AnalyzeEvenOddHelper anEvenOddServ = new AnalyzeEvenOddHelper();
    private final NormalizeNamesStreamHelper normNamesStreamServ = new NormalizeNamesStreamHelper();

    @Override
    public List<Integer> filterAndMultiply(List<Integer> numbers) {
        return filAndMultServ.filterAndMultiply(numbers);
    }

    @Override
    public Map<String, Double> calculateStats(List<Integer> numbers) {
        return calcStatsServ.calculateStats(numbers);
    }

    @Override
    public Map<Integer, List<String>> groupByLength(List<String> words) {
        return groupByLengthServ.groupByLength(words);
    }

    @Override
    public List<String> topNLongest(List<String> words, int n) {
        return topNLongServ.topNLongest(words, n);
    }

    @Override
    public List<Integer> flattenAndSort(List<List<Integer>> nestedLists) {
        return flatAndSortServ.flattenAndSort(nestedLists);
    }

    @Override
    public Map<String, Double> analyzeEvenOdd(List<Integer> numbers) {
        return anEvenOddServ.analyzeEvenOdd(numbers);
    }

    @Override
    public List<String> normalizeNamesStream(List<String> names) {
        return normNamesStreamServ.normalizeNamesStream(names);
    }
}
