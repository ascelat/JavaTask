package org.example;

import java.util.List;

import org.example.task2.Task2_dev;
import org.example.tasks1.Task1_dev;

public class Main {
    public static void main(String[] args) {

        //Test Task1
        System.out.println();
        System.out.println("Task2");
        System.out.println();

        Task1_dev task1 = new Task1_dev();
        //isEven
        System.out.println(task1.isEven(15));
        System.out.println(task1.isEven(12)+ "\n");
        //findMax
        System.out.println(task1.findMax(15,14));
        System.out.println(task1.findMax(1,23)+ "\n");
        //isValidScore
        System.out.println(task1.isValidScore(97));
        System.out.println(task1.isValidScore(83));
        System.out.println(task1.isValidScore(70));
        System.out.println(task1.isValidScore(30));
        System.out.println(task1.isValidScore(120)+ "\n");
        //calculate
        System.out.println(task1.calculate(12,12,'+'));
        System.out.println(task1.calculate(12,12,'-'));
        System.out.println(task1.calculate(12,12,'*'));
        System.out.println(task1.calculate(12,12,'/')+ "\n");
        //isValidTriangle
        System.out.println(task1.isValidTriangle(1, 1, 1));
        System.out.println(task1.isValidTriangle(3, 4, 2));
        System.out.println(task1.isValidTriangle(3, 4, 4));
        System.out.println(task1.isValidTriangle(3, 1, 4));
        //calculateFinalPrice
        List<Long> arr = List.of(
            task1.calculateFinalPrice(100, 7, false, 4),
            task1.calculateFinalPrice(100, 70, false, 7),
            task1.calculateFinalPrice(100, 17, false, 5),
            task1.calculateFinalPrice(100, 22, true, 6),
            task1.calculateFinalPrice(100, 12, false, 1),
            task1.calculateFinalPrice(100, 35, false, 2)           
        );
        for (long i : arr){
            System.out.println(i);
        }


        // Test Task2
        System.out.println();
        System.out.println("Task2");
        System.out.println();

        Task2_dev task2 = new Task2_dev();

        //sumFromOneTo 
        List<Long> arr2 = List.of(
            task2.sumFromOneTo(15),
            task2.sumFromOneTo(2),
            task2.sumFromOneTo(53),
            task2.sumFromOneTo(34)
        );

        for (long i : arr2){
            System.out.println(i);
        }

        System.out.println();

        //formatLine

        task2.formatLine(3);
        System.out.println();

        // sumOfDigits

        System.out.println(task2.sumOfDigits(123) + "\n");

        //isPalindrome

        System.out.println(task2.isPalindrome(11111) + "\n");
        System.out.println(task2.isPalindrome(112311) + "\n");

        //isPrime

        System.out.println(task2.isPrime(7) + "\n");
        System.out.println(task2.isPrime(12) + "\n");

    }
}