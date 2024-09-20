package org.bordomey.task1;

import org.bordomey.task3.Machine;

public class Arctan {
    public static double calculate(double x, int terms) {
        double arctgValue = 0.0;
        if(Math.abs(x)>=1){
            throw new IllegalArgumentException("Must be in (-1;1) range");
        }
        for (int n = 1; n <= terms; n++) {
            double term = power(x, (2*n-1))/(2*n-1);
            arctgValue += (1-(n-1)%2*2)*term;
        }
        return arctgValue;
    }

    // Функция для вычисления степени
    public static double power(double base, int exponent) {
        double result = 1.0;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

}


