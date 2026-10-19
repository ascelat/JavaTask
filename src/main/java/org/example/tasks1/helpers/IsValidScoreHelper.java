package org.example.tasks1.helpers;

public class IsValidScoreHelper {
    public String isValidScore(int score) {
        return GradeScore.getScore(score).getLabel();
    }
}