package com.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public void showList(List list, int n)  {
        if (n>0) {
            System.out.println(list.get(n-1));
            showList(list, n-1);
        } else
            System.out.println("end");
    }

    public int binarySearch(int[] table, int l, int r, int e) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (table[mid] == e)
                return mid;

            if (table[mid] > e)
                return binarySearch(table, l, mid - 1, e);

            return binarySearch(table, mid + 1, r, e);
        }
        return -1;
    }
}
