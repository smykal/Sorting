package com;

import com.generating.GeneratingTable;
import com.recursion.RecursionMethods;
import com.sorting.BubbleSort;
import com.sorting.Sort;
import com.time.TimeCounter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//

        Main main = new Main();
        main.test();
    }

    private void test(){
        TimeCounter timeCounter = new TimeCounter();
        Sort bubbleSort = new BubbleSort();
        timeCounter.sortingTimeCounter(bubbleSort::sortTable);
    }
}
