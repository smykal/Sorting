package com.com.generating;

import java.util.Random;

public class GeneratingTable {
    public int[] generatingTable(int tableLength) {
        int[] table = new int[tableLength];
        for (int i = 0; i < tableLength; i++) {
            table[i] = new Random().nextInt(99);
        }
        return table;
    }
}
