package com.searching;

public class SimpleSearch implements Search{
    @Override
    public boolean search(int[] tableToSearch, int element) {
        int count = 1;
        boolean value = false;
        do {
            count++;
        } while (count <= tableToSearch.length && tableToSearch[count] != element);
        if (tableToSearch[count] == element) {
            value = true;
        }
        return value;
    }
}