package com;

import com.generating.GeneratingTable;
import com.recursion.RecursionMethods;

public class Main {
    public static void main(String[] args) {
        GeneratingTable generatingTable = new GeneratingTable();
        int[] ta = generatingTable.generatingTable(14);

        RecursionMethods recursionMethods = new RecursionMethods();
        System.out.println("sum: " + recursionMethods.sum(10));
        System.out.println("factorial: " + recursionMethods.factorial(6));
    }
}
