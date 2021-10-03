package com.searching;

public class BinarySearch {
    public boolean binarySearch(int[] table, int element) {
        int low = 0;
        int high = table.length - 1;
        int mid = (low + high);
        while (low <= high) {
            int value = table[mid];
            if (value == element) {
            } else if (value > element) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (table[mid] == element){
            return true;
        } else {
            return false;
        }
    }
}