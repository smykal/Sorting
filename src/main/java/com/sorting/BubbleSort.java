package com.sorting;

public class BubbleSort implements Sort {

    @Override
    public int[] sortTable(int[] tableToSort) {
        for (int j = 0; j < tableToSort.length - 1 ; j++) {
            for (int i = 1 ; i < tableToSort.length ; i++) {
                if (tableToSort[i-1] > tableToSort[i]) {
                    int tmp = tableToSort[i-1];
                    tableToSort[i-1] = tableToSort[i];
                    tableToSort[i] = tmp;
                }
            }
        }
        return tableToSort;
    }
}
