package org.example.task2.helpers;

public class FormatLineHelper {
    public void formatLine(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d;%n", number, i, number * i);
        }
    }
}
