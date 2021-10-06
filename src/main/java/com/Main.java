package com;

import com.generating.GeneratingTable;
import com.recursion.RecursionMethods;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GeneratingTable generatingTable = new GeneratingTable();
        int[] ta = generatingTable.generatingTable(14);

        RecursionMethods recursionMethods = new RecursionMethods();
        System.out.println("sum: " + recursionMethods.sum(10));
        System.out.println("factorial: " + recursionMethods.factorial(6));

        int[] table = {1,3,5,7,9};
        System.out.println("sum table: " + recursionMethods.sumTable(table,5));

        List<String> list = new ArrayList();
        list.add("Marta");
        list.add("Monika");
        list.add("Kinga");
        list.add("Asia");

        recursionMethods.showList(list,4);
    }
}
