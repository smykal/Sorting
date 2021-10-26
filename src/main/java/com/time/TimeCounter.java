package com.time;

import com.generating.GeneratingTable;

import java.util.function.Function;

public class TimeCounter {

    public void sortingTimeCounter(Function<int[],int[]> sortingFunction) {
        GeneratingTable generatingTable = new  GeneratingTable();

        for (int i = 0 ; i < 10 ; i++) {
            int tmp = i*i*i*i*i*i*i*i;

            long timeStart = System.nanoTime();
            int[] table = generatingTable.generatingTable(tmp);
            sortingFunction.apply(table);
            long timeEnd = System.nanoTime();
            long timeFinal = timeEnd - timeStart;
            System.out.println(tmp + "     " + timeFinal/1000);
        }
    }
}
