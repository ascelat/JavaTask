package org.example.tasks1;

public class Task1Impl implements Task1{
    @Override
    public boolean isEven(int number) {
        if(number % 2 == 0){
            return true;
        }
        return false;
    }

    @Override
    public int findMax(int a, int b) {
        if(a >= b){
            return a;
        }
        return b;
    }

    @Override
    public String isValidScore(int score) {
        if(score >= 90){
            return "Отлично";
        } else if (score >= 75) {
            return "Хорошо";
        } else if (score >= 60) {
            return "Удовлетворительно";
        }
        return "Неудовлетворительно";
    }

    @Override
    public int calculate(int a, int b, char operator) {
        if (operator == '+'){
            return a + b;
        } else if(operator == '-'){
            return a - b;
        } else if (operator == '*') {
            return a * b;
        } else if (operator == '/' && b != 0) {
            return a / b;
        }
        return 0;
    }

    @Override
    public String isValidTriangle(double a, double b, double c) {
        if(a + b > c && a + c > b && b + c > a){
            if (a == b && b == c){
                return "равносторонний";
            } else if (a == b || b == c || a == c ) {
                return "равнобедренный";
            }
            return "разносторонний";
        }
        return "Данные не валидны. Треугольник не существует";
    }

    @Override
    public long calculateFinalPrice(double basePrice, int age, boolean isStudent, int dayOfWeek) {
        double discount = 0;
        boolean weekend = true;

        if(dayOfWeek <= 5){
            weekend = false;
        }

        if(age < 7){
            discount = 1.0;
        } else if (age < 18) {
            discount= 0.5;
        } else if (age < 26 && isStudent) {
            discount = 0.3;
        } else if (age >= 60) {
            discount = 0.4;
        }

        double price = basePrice * (1 - discount);

        if (weekend){
            price *= 0.9;
        }

        if(price >= 0){
            return (long) price;
        }
        else{
            return 0;
        }
    }
}
