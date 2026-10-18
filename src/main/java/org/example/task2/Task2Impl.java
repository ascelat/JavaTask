package org.example.task2;

public class Task2Impl implements Task2 {
    @Override
    public long sumFromOneTo(int n) {
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    @Override
    public void formatLine(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }

    @Override
    public int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    @Override
    public boolean isPalindrome(int number) {
        String num = String.valueOf(number);
        char[] chars = num.toCharArray();
        for (int i = 0; i < num.length(); i++) {
            if (chars[i] != chars[num.length() - (i + 1)]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
