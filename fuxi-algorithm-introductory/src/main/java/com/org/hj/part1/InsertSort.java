package com.org.hj.part1;

import java.util.List;

/**
 * @author wanghuajun
 * @date 2020-10-22 12:44
 */
public class InsertSort {
    public static void sort(Integer[] targetList) {
        if (targetList == null || targetList.length <= 1) {
            return;
        }

        for (int i = 1; i < targetList.length; i++) {
            if (targetList[i] >= targetList[i - 1]) {
                continue;
            }
            int temp = targetList[i];
            int tempIndex = i - 1;
            while (tempIndex >= 0 && temp < targetList[tempIndex]) {
                targetList[tempIndex + 1] = targetList[tempIndex];
                tempIndex--;
            }
            targetList[tempIndex+1]=temp;
        }

    }
}
