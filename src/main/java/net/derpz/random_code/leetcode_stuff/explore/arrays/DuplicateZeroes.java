package net.derpz.random_code.leetcode_stuff.explore.arrays;

import java.util.LinkedList;
import java.util.Queue;

public class DuplicateZeroes {
    public void duplicateZeros(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0, arrLength = arr.length; i < arrLength; i++) {
            int j = arr[i];
            if (j == 0) {
                queue.offer(0);
                queue.offer(0);
            } else {
                queue.offer(j);
            }
            arr[i] = queue.poll();
        }
    }
}
