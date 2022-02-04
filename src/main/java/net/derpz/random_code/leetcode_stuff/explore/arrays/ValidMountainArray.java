package net.derpz.random_code.leetcode_stuff.explore.arrays;

public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        boolean currentlyIncreasing = true;
        boolean changed = false;
        int prevNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == prevNum) return false;

            if (i == arr.length - 1 && currentlyIncreasing) return false;

            if (arr[i] > prevNum)  {
                if (currentlyIncreasing) {
                    //continue;
                } else {
                    if (changed) {
                        return false;
                    } else {
                        currentlyIncreasing = false;
                        changed = true;
                    }
                }
            } else if (arr[i] < prevNum) {
                if (currentlyIncreasing) {
                    if (changed) {
                        return false;
                    } else {
                        currentlyIncreasing = false;
                        changed = true;
                    }
                } else {
                    //continue;
                }
            }
            prevNum = arr[i];
        }
        return true;
    }
}
