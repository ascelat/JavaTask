package org.example;

import java.util.*;

import org.example.task2.Task2_dev;
import org.example.task3.Task3_dev;
import org.example.task3.Task3_1_dev;
import org.example.tasks1.Task1_dev;

public class Main {

    public static void main(String[] args) {
        testTask1();
        testTask2();
        testTask3();
        testTask3_1();
    }

    // ======================== Task 1 ========================
    private static void testTask1() {
        printHeader("Task 1");
        Task1_dev task1 = new Task1_dev();

        printSubHeader("isEven");
        System.out.println(task1.isEven(15));   // false
        System.out.println(task1.isEven(12));   // true

        printSubHeader("findMax");
        System.out.println(task1.findMax(15, 14)); // 15
        System.out.println(task1.findMax(1, 23));  // 23

        printSubHeader("isValidScore");
        System.out.println(task1.isValidScore(97));  // true
        System.out.println(task1.isValidScore(83));  // true
        System.out.println(task1.isValidScore(70));  // true
        System.out.println(task1.isValidScore(30));  // false
        System.out.println(task1.isValidScore(120)); // false

        printSubHeader("calculate");
        System.out.println(task1.calculate(12, 12, '+')); // 24
        System.out.println(task1.calculate(12, 12, '-')); // 0
        System.out.println(task1.calculate(12, 12, '*')); // 144
        System.out.println(task1.calculate(12, 12, '/')); // 1

        printSubHeader("isValidTriangle");
        System.out.println(task1.isValidTriangle(1, 1, 1)); // true
        System.out.println(task1.isValidTriangle(3, 4, 2)); // true
        System.out.println(task1.isValidTriangle(3, 4, 4)); // true
        System.out.println(task1.isValidTriangle(3, 1, 4)); // false

        printSubHeader("calculateFinalPrice");
        List<Long> prices = List.of(
                task1.calculateFinalPrice(100, 7, false, 4),
                task1.calculateFinalPrice(100, 70, false, 7),
                task1.calculateFinalPrice(100, 17, false, 5),
                task1.calculateFinalPrice(100, 22, true, 6),
                task1.calculateFinalPrice(100, 12, false, 1),
                task1.calculateFinalPrice(100, 35, false, 2)
        );
        prices.forEach(System.out::println);
    }

    // ======================== Task 2 ========================
    private static void testTask2() {
        printHeader("Task 2");
        Task2_dev task2 = new Task2_dev();

        printSubHeader("sumFromOneTo");
        List<Long> sums = List.of(
                task2.sumFromOneTo(15),
                task2.sumFromOneTo(2),
                task2.sumFromOneTo(53),
                task2.sumFromOneTo(34)
        );
        sums.forEach(System.out::println);

        printSubHeader("formatLine");
        task2.formatLine(3);

        printSubHeader("sumOfDigits");
        System.out.println(task2.sumOfDigits(123)); // 6

        printSubHeader("isPalindrome");
        System.out.println(task2.isPalindrome(11111));  // true
        System.out.println(task2.isPalindrome(112311)); // false

        printSubHeader("isPrime");
        System.out.println(task2.isPrime(7));  // true
        System.out.println(task2.isPrime(12)); // false
    }

    // ======================== Task 3 ========================
    private static void testTask3() {
        printHeader("Task 3");
        Task3_dev task3 = new Task3_dev();

        printSubHeader("removeDuplicates");
        System.out.println(task3.removeDuplicates(List.of(1, 2, 3, 4, 2, 1, 2, 3, 1, 4, 5, 6, 2, 1)));

        printSubHeader("findIntersection");
        System.out.println(task3.findIntersection(
                List.of(1, 2, 3, 6, 7),
                List.of(8, 9, 4, 5, 6, 7)
        ));

        printSubHeader("countWords");
        System.out.println(task3.countWords(List.of("java", "python", "java", "c++", "java")));

        printSubHeader("groupByGrade");
        System.out.println(task3.groupByGrade(
                Map.of("Аня", 5, "Боря", 4, "Вера", 5, "Гена", 3, "Дима", 4)
        ));

        printSubHeader("findMostFrequent");
        System.out.println(task3.findMostFrequent(List.of(1, 1, 1, 1, 1, 12, 2, 3, 4, 2, 3, 1)));

        printSubHeader("compareSets");
        System.out.println(task3.compareSets(
                Set.of("a", "b", "d"),
                Set.of("d", "a", "f", "t")
        ));

        printSubHeader("sumOfLengths");
        System.out.println(task3.sumOfLengths(List.of("java", "is", "cool")));

        printSubHeader("normalizeNames");
        System.out.println(task3.normalizeNames(Arrays.asList(" аня ", "", null, "боря")));
    }

    // ======================== Task 3.1 (Stream API) ========================
    private static void testTask3_1() {
        printHeader("Task 3.1 (Stream API)");
        Task3_1_dev task = new Task3_1_dev();

        printSubHeader("filterAndMultiply");
        System.out.println(task.filterAndMultiply(List.of(1, 2, 3, 4, 5, 6))); // [20, 40, 60]
        System.out.println(task.filterAndMultiply(List.of(1, 3, 5)));          // []
        System.out.println(task.filterAndMultiply(List.of()));                 // []
        System.out.println(task.filterAndMultiply(List.of(-2, -3, 0, 8)));     // [-20, 0, 80]

        printSubHeader("calculateStats");
        System.out.println(task.calculateStats(List.of(1, 2, 3, 4, 5)));
        System.out.println(task.calculateStats(List.of(10)));
        System.out.println(task.calculateStats(List.of()));
        System.out.println(task.calculateStats(List.of(-5, -1, -3)));

        printSubHeader("groupByLength");
        System.out.println(task.groupByLength(List.of("a", "bb", "cc", "ddd", "ee")));
        System.out.println(task.groupByLength(List.of("", "a", "")));
        System.out.println(task.groupByLength(List.of()));

        printSubHeader("topNLongest");
        System.out.println(task.topNLongest(List.of("apple", "kiwi", "banana", "fig"), 2));
        System.out.println(task.topNLongest(List.of("a", "b", "c"), 5));
        System.out.println(task.topNLongest(List.of("a", "b", "c"), 0));
        System.out.println(task.topNLongest(List.of(), 3));

        printSubHeader("flattenAndSort");
        System.out.println(task.flattenAndSort(List.of(
                List.of(3, 1, 2),
                List.of(2, 4),
                List.of(5, 1)
        ))); // [1, 2, 3, 4, 5]
        System.out.println(task.flattenAndSort(List.of(List.of(), List.of())));
        System.out.println(task.flattenAndSort(List.of(List.of(5, 5, 5))));
        System.out.println(task.flattenAndSort(List.of()));

        printSubHeader("analyzeEvenOdd");
        System.out.println(task.analyzeEvenOdd(List.of(1, 2, 3, 4, 5, 6)));
        System.out.println(task.analyzeEvenOdd(List.of(2, 4, 6)));
        System.out.println(task.analyzeEvenOdd(List.of(1, 3, 5)));
        System.out.println(task.analyzeEvenOdd(List.of()));
        System.out.println(task.analyzeEvenOdd(List.of(-2, -3, 0)));

        printSubHeader("normalizeNamesStream");
        System.out.println(task.normalizeNamesStream(List.of("  alice ", "BOB", "  Charlie  ")));
        System.out.println(task.normalizeNamesStream(List.of()));
        System.out.println(task.normalizeNamesStream(Arrays.asList("  x ", null, "y")));
    }

    // ======================== Helpers ========================
    private static void printHeader(String title) {
        System.out.println();
        System.out.println("========================================");
        System.out.println("  " + title);
        System.out.println("========================================");
    }

    private static void printSubHeader(String title) {
        System.out.println();
        System.out.println("--- " + title + " ---");
    }
}