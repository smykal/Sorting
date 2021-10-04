package com.searching;

public class BinarySearch {
    public int binarySearch(int[] table, int element) {
        int low = 0;
        int high = table.length - 1;

        int elementPos = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (table[mid] == element) {
                elementPos = mid;
                break;
            } else if (table[mid] > element){
                high = mid - 1;
            } else if (table[mid] < element) {
                low = mid +1;
            }
        }

    return elementPos;
    }
}