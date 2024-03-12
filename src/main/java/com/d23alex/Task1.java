package com.d23alex;

public class Task1 {
    public static double CONVERGENCE_RANGE_FROM = -1;
    public static double CONVERGENCE_RANGE_TO = 1;

    public static double arctan(double x, int terms) {
        if (x < CONVERGENCE_RANGE_FROM || x > CONVERGENCE_RANGE_TO)
            throw new IllegalArgumentException();
        double result = 0;
        for (int n = 0; n < terms; n++) {
            int sign = n % 2 == 0 ? 1 : -1;
            result += sign * Math.pow(x, 2 * n + 1) / (2 * n + 1);
        }
        return result;
    }
}
