package com.org.hj.application;

import com.org.hj.factory.ArrayFactory;
import com.org.hj.part1.InsertSort;

/**
 * @author wanghuajun
 * @date 2020-10-22 12:50
 */
public class Part1Main {
    public static void main(String[] args) {

        Integer[] insertSortArr = ArrayFactory.getSortNotArray();
        ArrayFactory.traceArray(insertSortArr);
        InsertSort.sort(insertSortArr);
        ArrayFactory.traceArray(insertSortArr);


    }
}
