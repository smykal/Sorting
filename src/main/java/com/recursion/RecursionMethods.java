package com.recursion;

import java.util.Arrays;

public class RecursionMethods {
    public int sum(int n) {
        if(n > 0) {
            return n + sum(n-1);
        } else {
            return 0;
        }
    }

    public int factorial(int n) {
        if (n >= 1) {
            return n * factorial(n-1);
        } else {
            return 1;
        }
    }

    public int sumTable(int[] table, int n) {
        if(n > 0) {
            return table[n-1] + sumTable(table, n-1);
        } else {
            return 0;
        }
    }
}