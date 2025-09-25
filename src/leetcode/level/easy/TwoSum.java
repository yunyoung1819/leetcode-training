package leetcode.level.easy;

import java.util.Arrays;

/**
 * title: 1. Two Sum
 * date: 2025.09.25
 * author: yun young
 * link: https://leetcode.com/problems/two-sum/description/?envType=problem-list-v2&envId=array
 * description: Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice. You can return the answer in any order.
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int first = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                int second = nums[j];
                int sum = first + second;
                if (sum == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
