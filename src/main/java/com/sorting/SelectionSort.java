package com.sorting;

public class SelectionSort implements Sort{
    @Override
    public int[] sortTable(int[] tableToSort) {

        for (int i = 0; i <tableToSort.length ; i++) {
            int tmp = tableToSort[i];
            int tmp1index = i;

            for (int j = i; j < tableToSort.length ; j++) {
                if (tableToSort[tmp1index] > tableToSort[j]) {
                    tmp1index = j;
                }
            }
            if (tableToSort[i] > tableToSort[tmp1index]) {
                tableToSort[i] = tableToSort[tmp1index];
                tableToSort[tmp1index] = tmp;
            }
        }
        return tableToSort;
    }
}
