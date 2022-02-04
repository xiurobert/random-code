package net.derpz.random_code.leetcode_stuff.explore.arrays;

public class FindEvenLength {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (Integer.toString(num).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

}