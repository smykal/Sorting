package com.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {


    @Test
    void shouldReturnSortedTable() {
        //given
        int[] tableToSort = {26,11,30,10,20};
        Sort sortingAlgorithm = new SelectionSort();

        //when
        int[] actual = sortingAlgorithm.sortTable(tableToSort);
        int[] expected = {10,11,20,26,30};

        //then
        assertArrayEquals(expected,actual);

    }
}