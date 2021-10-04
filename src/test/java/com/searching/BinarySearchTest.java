package com.searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void shouldReturn2when5() {
        //given
        int[] table = {1,3,5,7,9,11,13};
        int element = 5;
        BinarySearch binarySearch = new BinarySearch();

        //when
        int actual = binarySearch.search(table,element);

        //then
        assertEquals(actual,2);
    }

    @Test
    void shouldReturn0when1() {
        //given
        int[] table = {1,3,5,7,9,11,13};
        int element = 1;
        BinarySearch binarySearch = new BinarySearch();

        //when
        int actual = binarySearch.search(table,element);

        //then
        assertEquals(actual,0);
    }

    @Test
    void shouldReturn5when11() {
        //given
        int[] table = {1,3,5,7,9,11,13};
        int element = 11;
        BinarySearch binarySearch = new BinarySearch();

        //when
        int actual = binarySearch.search(table,element);

        //then
        assertEquals(actual,5);
    }

    @Test
    void shouldReturn6when13() {
        //given
        int[] table = {1,3,5,7,9,11,13};
        int element = 13;
        BinarySearch binarySearch = new BinarySearch();

        //when
        int actual = binarySearch.search(table,element);

        //then
        assertEquals(actual,6);
    }
    @Test
    void shouldReturn1when99() {
        //given
        int[] table = {1,3,5,7,9,11,13};
        int element = 99;
        Search binarySearch = new BinarySearch();
        
        //when
        int actual = binarySearch.search(table,element);

        //then
        assertEquals(actual,-1);
    }
}