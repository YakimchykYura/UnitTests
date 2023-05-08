package org.example;

public class SumCalculator {
    public int sum(int n) {
        validator(n);
        int result = 0;

        for (int i = 0;i <= n;i++) {
            result = i + result;
       }
        return result;
    }
    private void validator(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }
    }
}