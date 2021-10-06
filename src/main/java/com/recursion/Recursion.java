package com.recursion;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Recursion {
    public int recursion(int[] table) {
        int index = table.length;
        if (index == 0) {
            return -999;
        } else {
            System.out.println(table[index - 1]);
            return recursion(Arrays.copyOfRange(table,0,index-1));
        }
    }
}
