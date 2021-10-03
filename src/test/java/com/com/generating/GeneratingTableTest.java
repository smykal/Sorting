package com.com.generating;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class GeneratingTableTest {

    @Test
    public void shouldReturnTable() {
        //given
        int tableLength = 10;

        //when
        GeneratingTable table = new GeneratingTable();
        int[] newTable = table.generatingTable(tableLength);

        //than
        int expected = 10;
        int actual = newTable.length;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnIntTable() {
        //given
        int randomInt = new Random().nextInt(99);
        GeneratingTable generatingTable = new GeneratingTable();
        int[] table = generatingTable.generatingTable(randomInt);
        //when
        String simpleName = table.getClass().getSimpleName();

        //than
        assertEquals("int[]", simpleName);
    }

}