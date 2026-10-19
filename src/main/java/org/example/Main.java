package org.example;

import org.example.tasks1.Task1;
import org.example.tasks1.TaskDev1;

public class Main {
    public static void main(String[] args) {
        Task1 task = new TaskDev1();

        demoIsEven(task);
        demoFindMax(task);
        demoIsValidScore(task);
        demoCalculate(task);
        demoIsValidTriangle(task);
        demoCalculateFinalPrice(task);

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
    }
}