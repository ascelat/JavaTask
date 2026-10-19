package org.example.task2;

import org.example.task2.helpers.*;

public class TaskDev2 implements Task2 {
    private final SumFromOneToHelper sumFromOneToServ = new SumFromOneToHelper();
    private final FormatLineHelper formatLineServ = new FormatLineHelper();
    private final SumOfDigitsHelper sumOfDigitsServ = new SumOfDigitsHelper();
    private final IsPalindromeHelper isPalindromeServ = new IsPalindromeHelper();
    private final IsPrimeHelper isPrimeServ = new IsPrimeHelper();

    @Override
    public long sumFromOneTo(int n) {
        return sumFromOneToServ.sumFromOneTo(n);
    }

    @Override
    public void formatLine(int number) {
        formatLineServ.formatLine(number);
    }

    @Override
    public int sumOfDigits(int number) {
        return sumOfDigitsServ.sumOfDigits(number);
    }

    @Override
    public boolean isPalindrome(int number) {
        return isPalindromeServ.isPalindrome(number);
    }

    @Override
    public boolean isPrime(int number) {
        return isPrimeServ.isPrime(number);
    }
}
