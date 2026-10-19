package org.example.tasks1.helpers;

public class IsValidTriangleHelper {
    private static final double EPS = 1e-9;
    private static final String ERROR = "Данные не валидны. Треугольник не существует";

    public String isValidTriangle(double a, double b, double c) {
        if (a <= EPS || b <= EPS || c <= EPS) return ERROR;
        if (a + b <= c + EPS || a + c <= b + EPS || b + c <= a + EPS) return ERROR;

        boolean ab = Math.abs(a - b) <= EPS;
        boolean bc = Math.abs(b - c) <= EPS;
        boolean ac = Math.abs(a - c) <= EPS;

        if (ab && bc)       return "Равносторонний";
        if (ab || bc || ac) return "Равнобедренный";
        return "Разносторонний";
    }
}
