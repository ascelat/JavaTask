package org.example.tasks1;

import org.example.tasks1.helpers.*;

public class TaskDev1 implements Task1 {

    private final IsEvenHelper evenServ = new IsEvenHelper();
    private final FindMaxHelper maxServ = new FindMaxHelper();
    private final IsValidScoreHelper scoreServ = new IsValidScoreHelper();
    private final CalculateHelper calcServ = new CalculateHelper();
    private final IsValidTriangleHelper triangleServ = new IsValidTriangleHelper();
    private final CalculateFinalPriceHelper priceServ = new CalculateFinalPriceHelper();

    @Override
    public boolean isEven(int number) {
        return evenServ.isEven(number);
    }

    @Override
    public int findMax(int a, int b) {
        return maxServ.findMax(a, b);
    }

    @Override
    public String isValidScore(int score) {
        return scoreServ.isValidScore(score);
    }

    @Override
    public int calculate(int a, int b, char operator) {
        return calcServ.calculate(a, b, operator);
    }

    @Override
    public String isValidTriangle(double a, double b, double c) {
        return triangleServ.isValidTriangle(a, b, c);
    }

    @Override
    public long calculateFinalPrice(double basePrice, int age, boolean isStudent, int dayOfWeek) {
        return priceServ.calculateFinalPrice(basePrice, age, isStudent, dayOfWeek);
    }
}