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

        int[] table = {1,3,5,7,9};
        System.out.println("sum table: " + recursionMethods.sumTable(table,5));
    }
}
