package org.example.tasks1.helpers;

public class IsEvenHelper {
    public boolean isEven(int num) {
        return (num & 1) == 0; //маленький метод оптимизации вместо num % 2 == 0, нужен бенчмарк для точного понимания пользы
    }
}
