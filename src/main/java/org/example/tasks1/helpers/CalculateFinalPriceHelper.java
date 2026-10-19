package org.example.tasks1.helpers;

public class CalculateFinalPriceHelper {
    public long calculateFinalPrice(double basePrice, int age, boolean isStudent, int dayOfWeek) {
        if (!Double.isFinite(basePrice) || basePrice < 0) {
            throw new IllegalArgumentException("Некорректная базовая цена: " + basePrice);
        }
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным: " + age);
        }
        if (dayOfWeek < 1 || dayOfWeek > 7) {
            throw new IllegalArgumentException("Некорректный день недели: " + dayOfWeek);
        }

        int discount;
        if (age < 7) { // дети
            discount = 100;
        } else if (age <= 17) { // школьники
            discount = 50;
        } else if (age <= 25 && isStudent) { // студенты
            discount = 30;
        } else if (age >= 60) { // пенсионеры
            discount = 40;
        } else { // все остальные
            discount = 0;
        }
        if (dayOfWeek == 6 || dayOfWeek == 7) {
            discount = Math.min(100, discount + 10);
        }

        double finalPrice = basePrice * (100 - discount) / 100.0;
        if (finalPrice < 0) {
            finalPrice = 0;
        }

        return Math.round(finalPrice);
    }
}
