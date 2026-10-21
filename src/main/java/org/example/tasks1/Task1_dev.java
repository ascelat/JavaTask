package org.example.tasks1;

public class Task1_dev implements Task1{
    
    @Override 
    public boolean isEven(int number){
        return number % 2 == 0 ;
    }

    @Override 
    public int findMax(int a, int b){
        return Math.max(a, b);
    }

    @Override 
    public String isValidScore(int score){
        if (score >= 90) return "Отлично";
        if (score >= 75) return "Хорошо";
        if (score >= 60) return "Удовлетворительно";
        if (score >= 0)  return "Неудовлетворительно";
        return "Некорректная оценка";
    }

    @Override 
    public int calculate(int a, int b, char operator){
        return switch(operator){
            case '+' -> a+b;
            case '-' -> a-b;
            case '*' -> a*b;
            case '/' -> a/b;
            default -> 0;
        };
    }

    @Override 
    public String isValidTriangle(double a, double b, double c){
        if (a <= 0 || b <= 0 || c <= 0) {return "Данные не валидны. Треугольник не существует";}

        if (a + b <= c || a + c <= b || b + c <= a) {return "Данные не валидны. Треугольник не существует";}

        if (a == b && b == c) {return "Равносторонний";}
        
        if (a == b || a == c || b == c) {return "Равнобедренный";}

        return "Разносторонний";
    }

    @Override 
    public long calculateFinalPrice(double basePrice, int age, boolean isStudent, int dayOfWeek){
        double bp = basePrice;
        if (age < 8) {bp *= 0;}
        else if (age < 18 && age > 7) {bp *= 0.5;}
        else if ((age < 26 && age > 17) && isStudent == true) {bp *= 0.7;}
        else if (age > 59) {bp *= 0.6;}

        if (dayOfWeek == 6 || dayOfWeek == 7) {bp *= 0.9;}
        
        return Math.max((long) bp, 0);
    }

}
