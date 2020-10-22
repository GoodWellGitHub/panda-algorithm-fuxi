package com.org.hj.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author wanghuajun
 * @date 2020-10-22 12:45
 */
public class ArrayFactory {
    public static Integer[] getSortNotArray() {
        Integer[] result = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            result[i] = random.nextInt();
        }

        return result;
    }


    public static void traceArray(Integer[] targetList) {
        if (targetList == null) {
            return;
        }

        for (Integer value : targetList) {
            System.out.print("  " + value);
        }
        System.out.println();
    }

    public static List<Integer> getSortNotList() {
        List<Integer> result = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            result.add(random.nextInt());
        }

        return result;
    }


    public static void traceList(List<Integer> targetList) {
        if (targetList == null) {
            return;
        }

        for (Integer value : targetList) {
            System.out.print("  " + value);
        }
        System.out.println();
    }
}
