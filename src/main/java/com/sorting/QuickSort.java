package com.sorting;

public class QuickSort implements Sort {
    @Override
    public int[] sortTable(int[] tableToSort) {
        quickSort(tableToSort,0, tableToSort.length-1);
        return new int[0];
    }

    private void quickSort(int[] tableToSort, int left, int right) {
        if (left <right) {
            int pivot = partition(tableToSort, left, right);
        }
    }

    private int partition(int[] tableToSort, int left, int right) {
        return 0;
    }
}
