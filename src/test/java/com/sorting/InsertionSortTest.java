package com.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    @DisplayName("should return sorted table case 1")
    void shouldReturnSortedTableCase1() {
        //given
        int[] tableToSort = {0,1,2,3,4,5,6,7,8,9};
        //when
        InsertionSort insertionSort = new InsertionSort();
        int[] actualTable = insertionSort.sortTable(tableToSort);

        //then
        int[] expectedTable = {0,1,2,3,4,5,6,7,8,9};
        assertArrayEquals(expectedTable, actualTable);
    }

    @Test
    @DisplayName("should return sorted table case 2")
    void shouldReturnSortedTableCase2() {
        //given
        int[] tableToSort = {1,0,2,3,4,5,6,7,8,9};
        //when
        InsertionSort insertionSort = new InsertionSort();
        int[] actualTable = insertionSort.sortTable(tableToSort);

        //then
        int[] expectedTable = {0,1,2,3,4,5,6,7,8,9};
        assertArrayEquals(expectedTable, actualTable);
    }

    @Test
    @DisplayName("should return sorted table case 3")
    void shouldReturnSortedTableCase3() {
        //given
        int[] tableToSort = {9,8,7,6,5,4,3,2,1,0};
        //when
        InsertionSort insertionSort = new InsertionSort();
        int[] actualTable = insertionSort.sortTable(tableToSort);

        //then
        int[] expectedTable = {0,1,2,3,4,5,6,7,8,9};
        assertArrayEquals(expectedTable, actualTable);
    }

}