package com.sorting;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class InsertionSort implements Sort {
    public int[] sortTable(int[] tableToSort) {
        for (int i = 1; i < tableToSort.length; i++) {
            int tmp = tableToSort[i];
            int j = i - 1;

            while (j >= 0 && tableToSort[j] > tmp) {
                tableToSort[j + 1] = tableToSort[j];
                j = j - 1;
            }
            tableToSort[j + 1] = tmp;
        }
    return tableToSort;
    }
}

