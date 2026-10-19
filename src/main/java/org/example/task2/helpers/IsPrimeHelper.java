package org.example.task2.helpers;

public class IsPrimeHelper {
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (long i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
