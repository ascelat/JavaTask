package org.example.task2;

public class Task2_dev implements Task2{

    @Override 
    public long sumFromOneTo(int n){

        long sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }

        return sum;
    }

    @Override 
    public void formatLine(int number){
        for(int i = 1; i < 11; i++){
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }

    @Override 
    public int sumOfDigits(int number){
        int sum = 0;

        String num = Integer.toString(Math.abs(number));

        for (char c : num.toCharArray()) {
            sum += c - '0';
        }

        return sum;
    }

    @Override 
    public boolean isPalindrome(int number){
        String n = Integer.toString(number);
        String reves = new StringBuilder(n).reverse().toString();

        return n.equals(reves);
    }

    @Override 
    public boolean isPrime(int number){
        if (number <= 1) return false;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }

        return true;
    }
 
}
