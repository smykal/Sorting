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
        int pivot = tableToSort[right];
        int elementLowerThanPivot = left - 1;

        for (int i = 0; i < right; i++) {
            if (tableToSort[i] <= pivot) {
                elementLowerThanPivot++;
                int tmp = tableToSort[elementLowerThanPivot];
                tableToSort[elementLowerThanPivot] = tableToSort[i];
                tableToSort[i] = tmp;
            }
        }
        int tmp = tableToSort[elementLowerThanPivot + 1];
        tableToSort[elementLowerThanPivot +1] = tableToSort[right];
        tableToSort[right] = tmp;
        return elementLowerThanPivot + 1;
    }
}
