package leetcode.level.easy;

/**
 * Number: 1295
 * Title: Find Numbers with Even Number of Digits
 * Level: Easy
 * Problem: Given an array nums of integers, 
 * return how many of them contain an even number of digits.
 *
 */
public class Solution1295 {
	public int findNumbers(int[] nums) {
        String number = "";
        int digitCount = 0;
        for (int i = 0; i < nums.length; i++) {
            number = String.valueOf(nums[i]);
            if (number.length() %2 == 0) {
                digitCount++;
            }
        }
        return digitCount;
    }
}
