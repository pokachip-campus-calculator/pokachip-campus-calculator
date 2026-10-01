package com.pokachip.campus;

public class ScoreCalculator {
    public int getSum(int score1, int score2, int score3) {
        return score1 + score2 + score3;
    }

    public double getAverage(int sum, int count) {
        return sum / count;
    }

    public int getMin(int score1, int score2, int score3) {
        if (score1 < score2 && score1 < score3) {
            return score1;
        } else if (score2 < score1 && score2 < score3) {
            return score2;
        } else {
            return score3;
        }

    }
}
