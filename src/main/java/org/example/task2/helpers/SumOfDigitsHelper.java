package org.example.task2.helpers;

public class SumOfDigitsHelper {
    public int sumOfDigits(int number) {
        long n = Math.abs((long) number);
        int sum = 0;
        for (; n > 0; n /= 10) {
            sum += (int) (n % 10);
        }
        return sum;
    }
}
