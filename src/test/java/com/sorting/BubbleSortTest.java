package com.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    @DisplayName("should return sorted table case 1")
    void shouldReturnSortedTableCase1() {
        //given
        int[] tableToSort = {0,1,2,3,4,5,6,7,8,9};
        //when
        BubbleSort bubbleSort = new BubbleSort();
        int[] actualTable = bubbleSort.sortTable(tableToSort);

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
        BubbleSort bubbleSort = new BubbleSort();
        int[] actualTable = bubbleSort.sortTable(tableToSort);

        //then
        int[] expectedTable = {0,1,2,3,4,5,6,7,8,9};
        assertArrayEquals(expectedTable, actualTable);
    }

    @Test
    @DisplayName("should return sorted table case 3")
    void shouldReturnSortedTableCase3() {
        //given
        int[] tableToSort = {3,9,2,1,4,6,5,7,8,0};
        //when
        BubbleSort bubbleSort = new BubbleSort();
        int[] actualTable = bubbleSort.sortTable(tableToSort);

        //then
        int[] expectedTable = {0,1,2,3,4,5,6,7,8,9};
        assertArrayEquals(expectedTable, actualTable);
    }
}