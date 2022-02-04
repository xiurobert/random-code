package net.derpz.random_code;

import net.derpz.random_code.leetcode_stuff.explore.arrays.ValidMountainArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidMountainArrayTest {

    private ValidMountainArray solution = new ValidMountainArray();
    @Test
    public void testOne() {
        int[] arr = {2, 1};
        assertFalse(solution.validMountainArray(arr));
    }

    @Test
    public void testTwo() {
        int[] arr2 = {3, 5, 5};
        assertFalse(solution.validMountainArray(arr2));
    }

    @Test
    public void testThree() {
        int[] arr3 = {0, 3, 2, 1};
        assertTrue(solution.validMountainArray(arr3));
    }

    @Test
    public void testFour() {
        int[] arr4 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertFalse(solution.validMountainArray(arr4));
    }

    @Test
    public void testFive() {
        int[] arr5 = {0, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertTrue(solution.validMountainArray(arr5));
    }
}
