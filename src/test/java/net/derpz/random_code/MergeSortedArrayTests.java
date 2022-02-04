package net.derpz.random_code;

import net.derpz.random_code.leetcode_stuff.explore.arrays.MergeSortedArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@DisplayName("Merge Sorted Array")
public class MergeSortedArrayTests {
    @Test
    @DisplayName("Test 1")
    public static void testMergeSortedArray(String[] args) {
        MergeSortedArray sol = new MergeSortedArray();
        int[] nums1 = {1, 2, 3, 0, 0, 0}, nums2 = {2, 5, 6};
        sol.merge(nums1, 3, nums2, 3);
        for (int j : nums1) {
            System.out.print(j + " ");
        }
        System.out.println("Ran a test for merge sorted array");
        assert(Arrays.equals(nums1, new int[]{1, 2, 2, 3, 5, 6}));
    }
}
