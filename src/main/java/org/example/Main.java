package org.example;
import org.example.tasks1.Task1Impl;
import org.example.task2.Task2Impl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Task2Impl t2 = new Task2Impl();
        System.out.println(t2.sumFromOneTo(10));
        t2.formatLine(13);
        System.out.println(t2.sumOfDigits(567));
        System.out.println(t2.isPalindrome(345543));
        System.out.println(t2.isPrime(121));
    }
}