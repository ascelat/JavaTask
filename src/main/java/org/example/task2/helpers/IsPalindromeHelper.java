package org.example.task2.helpers;

public class IsPalindromeHelper {
    public boolean isPalindrome(int number) {
        int original = number;
        long reversed = 0;
        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed == original;
    }
}
