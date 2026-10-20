package org.example;

import org.example.tasks1.Task1;
import org.example.tasks1.TaskDev1;
import org.example.task2.Task2;
import org.example.task2.TaskDev2;
import org.example.task3.Task3;
import org.example.task3.TaskDev3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*Task1 task = new TaskDev1();

        demoIsEven(task);
        demoFindMax(task);
        demoIsValidScore(task);
        demoCalculate(task);
        demoIsValidTriangle(task);
        demoCalculateFinalPrice(task);

        Task2 task2 = new TaskDev2();

        demoSumFromOneTo(task2);
        demoFormatLine(task2);
        demoSumOfDigits(task2);
        demoIsPalindrome(task2);
        demoIsPrime(task2);*/

        Task3 task3 = new TaskDev3();

        demoRemoveDuplicates(task3);
        demoFindIntersection(task3);
        demoCountWords(task3);
        demoGroupByGrade(task3);
        demoFindMostFrequent(task3);
        demoCompareSets(task3);
        demoSumOfLengths(task3);
        demoNormalizeNames(task3);

    }

    private static void demoIsEven(Task1 task) {
        int[] values = {0, 1, 2, 3, -1, -2, -3, Integer.MAX_VALUE, Integer.MIN_VALUE};
        for (int v : values) {
            System.out.printf("isEven(%d) = %b%n", v, task.isEven(v));
        }
        System.out.println();
    }

    private static void demoFindMax(Task1 task) {
        int[][] pairs = {
                {3, 5}, {5, 3}, {7, 7}, {-1, -5}, {-5, -1},
                {Integer.MAX_VALUE, Integer.MIN_VALUE},
                {Integer.MIN_VALUE, Integer.MAX_VALUE}
        };
        for (int[] p : pairs) {
            System.out.printf("findMax(%d, %d) = %d%n",
                    p[0], p[1], task.findMax(p[0], p[1]));
        }
        System.out.println();
    }

    private static void demoIsValidScore(Task1 task) {
        int[] scores = {100, 99, 90, 89, 75, 74, 60, 59, 0, -1, 101};
        for (int s : scores) {
            try {
                System.out.printf("isValidScore(%d) = %s%n", s, task.isValidScore(s));
            } catch (IllegalArgumentException e) {
                System.out.printf("Ошибка isValidScore(%d): %s%n", s, e.getMessage());
            }
        }
        System.out.println();
    }

    private static void demoCalculate(Task1 task) {
        int[][] pairs = {{10, 5}, {10, 3}, {-10, 3}, {10, 0}};
        char[] ops = {'+', '-', '*', '/', '%'};

        for (int[] p : pairs) {
            for (char op : ops) {
                try {
                    System.out.printf("calculate(%d, %d, '%c') = %d%n",
                            p[0], p[1], op, task.calculate(p[0], p[1], op));
                } catch (RuntimeException e) {
                    System.out.printf("calculate(%d, %d, '%c'): %s: %s%n",
                            p[0], p[1], op, e.getClass().getSimpleName(), e.getMessage());
                }
            }
        }
        System.out.println();
    }

    private static void demoIsValidTriangle(Task1 task) {
        double[][] triangles = {
                // валидные
                {3, 3, 3}, {5, 5, 5},
                {3, 3, 5}, {5, 3, 3}, {3, 5, 3},
                {3, 4, 5}, {5, 4, 3},
                // невалидные
                {1, 2, 3}, {1, 2, 4},
                {0, 1, 1}, {-1, 2, 2}, {1, 1, 2.5}
        };
        for (double[] t : triangles) {
            System.out.printf("isValidTriangle(%.1f, %.1f, %.1f) = %s%n",
                    t[0], t[1], t[2], task.isValidTriangle(t[0], t[1], t[2]));
        }
        System.out.println();
    }

    private static void demoCalculateFinalPrice(Task1 task) {
        double base = 100.0;

        Object[][] cases = {
                {5,  false, 1},
                {7,  false, 1},
                {10, false, 1},
                {17, false, 1},
                {18, true,  1},
                {20, true,  1},
                {25, true,  1},
                {25, false, 1},
                {30, false, 1},
                {59, false, 1},
                {60, false, 1},
                {65, false, 1},
                {5,  false, 7},
                {10, false, 6},
                {20, true,  7},
                {65, false, 7},
                {30, false, 6},
                {1000,  false, 9},
                {-5,  false, 1},
        };

        for (Object[] c : cases) {
            int age = (int) c[0];
            boolean isStudent = (boolean) c[1];
            int day = (int) c[2];
            try {
                long price = task.calculateFinalPrice(base, age, isStudent, day);
                System.out.printf("price(age=%d, student=%-5b, day=%s) = %d%n",
                        age, isStudent, day, price);
            } catch (IllegalArgumentException e) {
                System.out.printf("price(age=%d, student=%b, day=%s): %s%n",
                        age, isStudent, day, e.getMessage());
            }
        }
        System.out.println();
    }

    //Task2

    private static void demoSumFromOneTo(Task2 task) {
        int[] values = {1, 2, 3, 4, 5, 10, 100, 1000, 100_000, Integer.MAX_VALUE};
        for (int n : values) {
            System.out.printf("sumFromOneTo(%d) = %d%n", n, task.sumFromOneTo(n));
        }
        System.out.println();
    }

    private static void demoFormatLine(Task2 task) {
        int[] numbers = {3, 7, 0, -2};
        for (int n : numbers) {
            System.out.printf("formatLine(%d):%n", n);
            task.formatLine(n);
        }
        System.out.println();
    }

    private static void demoSumOfDigits(Task2 task) {
        int[] values = {0, 1, 5, 9, 10, 99, 567, 123456789, Integer.MAX_VALUE, Integer.MIN_VALUE};
        for (int v : values) {
            System.out.printf("sumOfDigits(%d) = %d%n", v, task.sumOfDigits(v));
        }
        System.out.println();
    }

    private static void demoIsPalindrome(Task2 task) {
        int[] values = {
                0, 1, 7, 11, 121, 1221, 12321, 1_000_000_001,
                10, 100, 123, 321, 1002, 123456,
                Integer.MAX_VALUE, 2_147_474_741
        };
        for (int v : values) {
            System.out.printf("isPalindrome(%d) = %b%n", v, task.isPalindrome(v));
        }
        System.out.println();
    }

    private static void demoIsPrime(Task2 task) {
        int[] values = {
                -10, -1, 0, 1, 2, 3, 4, 5, 6, 7, 9, 11, 13, 17, 19, 23, 29,
                97, 101, 997, 7919, 104_729,
                1_000_000, 1_000_000_007,
                Integer.MAX_VALUE
        };
        for (int v : values) {
            System.out.printf("isPrime(%d) = %b%n", v, task.isPrime(v));
        }
        System.out.println();
    }

    //Task3

    private static void demoRemoveDuplicates(Task3 task) {
        List<List<Integer>> cases = List.of(
                List.of(1, 2, 2, 3, 1, 4, 3),
                List.of(),
                List.of(5, 5, 5, 5),
                List.of(1, 2, 3, 4, 5),
                List.of(3, 1, 3, 2, 1, 3)
        );
        for (List<Integer> c : cases) {
            System.out.printf("removeDuplicates(%s) = %s%n", c, task.removeDuplicates(c));
        }
        System.out.println();
    }

    private static void demoFindIntersection(Task3 task) {
        List<List<Integer>> firsts = List.of(
                List.of(1, 2, 3, 4),
                List.of(1, 1, 2, 2),
                List.of(),
                List.of(5)
        );
        List<List<Integer>> seconds = List.of(
                List.of(3, 4, 5, 6),
                List.of(2, 2, 3, 3),
                List.of(1, 2),
                List.of(5, 6)
        );
        for (int i = 0; i < firsts.size(); i++) {
            List<Integer> f = firsts.get(i);
            List<Integer> s = seconds.get(i);
            System.out.printf("findIntersection(%s, %s) = %s%n", f, s, task.findIntersection(f, s));
        }
        System.out.println();
    }

    private static void demoCountWords(Task3 task) {
        List<List<String>> cases = List.of(
                Arrays.asList("java", "python", "java", "c++", "java"),
                Arrays.asList("a", "a", "b", "b", "b", "c"),
                List.of(),
                List.of("only"),
                Arrays.asList("java", null, "java", null, "python")
        );
        for (List<String> c : cases) {
            System.out.printf("countWords(%s) = %s%n", c, task.countWords(c));
        }
        System.out.println();
    }

    private static void demoGroupByGrade(Task3 task) {
        Map<String, Integer> students = new LinkedHashMap<>();
        students.put("Аня", 5);
        students.put("Боря", 4);
        students.put("Вера", 5);
        students.put("Гена", 3);
        students.put("Дима", 4);

        System.out.printf("groupByGrade(%s) = %s%n", students, task.groupByGrade(students));
        System.out.println();
    }

    private static void demoFindMostFrequent(Task3 task) {
        List<List<Integer>> cases = List.of(
                List.of(3, 1, 3, 2, 1, 3),
                List.of(5, 5, 2, 2, 3),
                List.of(1),
                List.of(7, 7),
                List.of(1, 2, 3, 4, 5),
                List.of(2, 2, 1, 1, 3, 3)
        );
        for (List<Integer> c : cases) {
            System.out.printf("findMostFrequent(%s) = %d%n", c, task.findMostFrequent(c));
        }
        System.out.println();
    }

    private static void demoCompareSets(Task3 task) {
        List<Set<String>> firsts = List.of(
                Set.of("a", "b", "c", "d"),
                Set.of("a", "b"),
                Set.of(),
                Set.of("x", "y")
        );
        List<Set<String>> seconds = List.of(
                Set.of("c", "d", "e", "f"),
                Set.of("a", "b", "c", "d"),
                Set.of("a", "b"),
                Set.of("z")
        );
        for (int i = 0; i < firsts.size(); i++) {
            Set<String> f = firsts.get(i);
            Set<String> s = seconds.get(i);
            System.out.printf("compareSets(%s, %s) = %s%n", f, s, task.compareSets(f, s));
        }
        System.out.println();
    }

    private static void demoSumOfLengths(Task3 task) {
        List<List<String>> cases = List.of(
                Arrays.asList("java", "is", "cool"),
                List.of(),
                Arrays.asList("", "a", "bb", "ccc"),
                Arrays.asList("java", null, "is"),
                Arrays.asList(null, null)
        );
        for (List<String> c : cases) {
            System.out.printf("sumOfLengths(%s) = %d%n", c, task.sumOfLengths(c));
        }
        System.out.println();
    }

    private static void demoNormalizeNames(Task3 task) {
        List<List<String>> cases = List.of(
                Arrays.asList(" аня ", "", null, "боря"),
                Arrays.asList("hello", "world"),
                Arrays.asList("   ", "  X  "),
                Collections.singletonList(null),
                List.of()
        );
        for (List<String> c : cases) {
            System.out.printf("normalizeNames(%s) = %s%n", c, task.normalizeNames(c));
        }
        System.out.println();
    }
}