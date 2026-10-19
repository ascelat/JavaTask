package org.example.tasks1.helpers;

public enum GradeScore {
    EXCELLENT(90, 100, "Отлично"),
    GOOD(75, 89, "Хорошо"),
    SATISFACTORY(60, 74, "Удовлетворительно"),
    UNSATISFACTORY(0, 59, "Неудовлетворительно");

    private final int min;
    private final int max;
    private final String label;

    GradeScore(int min, int max, String label) {
        this.min = min;
        this.max = max;
        this.label = label;
    }

    private boolean containsScore(int score) {
        return score >= min && score <= max;
    }

    public String getLabel() {
        return label;
    }

    public static GradeScore getScore(int score) {
        for (GradeScore grade : values()) {
            if (grade.containsScore(score)) {
                return grade;
            }
        }
        throw new IllegalArgumentException("Некорректный балл: " + score);
    }
}