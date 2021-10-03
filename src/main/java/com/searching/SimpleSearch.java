package com.searching;

public class SimpleSearch implements Search{
    @Override
    public boolean search(int[] table, int element) {
        int count = 1;
        boolean value = false;
        do {
            count++;
        } while (count <= table.length && table[count] != element);
        if (table[count] == element) {
            value = true;
        }
        return value;
    }
}