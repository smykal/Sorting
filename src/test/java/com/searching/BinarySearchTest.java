package com.searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void shouldReturnTrue5() {
        //given
        int[] table = {1,3,5,7,9,11,13};
        int element = 5;
        BinarySearch binarySearch = new BinarySearch();

        //when
        boolean actual = binarySearch.binarySearch(table,element);

        //then
        assertTrue(actual);
    }

    @Test
    void shouldReturnTrue13() {
        //given
        int[] table = {1,3,5,7,9,11,13};
        int element = 13;
        BinarySearch binarySearch = new BinarySearch();

        //when
        boolean actual = binarySearch.binarySearch(table,element);

        //then
        assertTrue(actual);
    }
}