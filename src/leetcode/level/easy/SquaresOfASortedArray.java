package leetcode.level.easy;

import java.util.Arrays;

/**
 * 
 * 문제번호 : 977번 
 * 문제제목 : Squares of a Sorted Array
 * 문제링크 : https://leetcode.com/problems/squares-of-a-sorted-array/
 * 작 성 일 : 2020.05.05
 * 작 성 자 : YUN YOUNG
 * 문제내용 : Given an array of integers A sorted in non-decreasing order, 
 * return an array of the squares of each number, also in sorted non-decreasing order.
 * 
 * Example 1
 * Input: [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * 
 * Example2
 * Input: [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 *
 */
public class SquaresOfASortedArray {
	public int[] sortedSquares(int[] A) {
        int[] sortedSquares = new int[A.length];
        
        for (int i = 0; i < A.length; i++) 
            sortedSquares[i] = A[i] * A[i];
        
        Arrays.sort(sortedSquares);
        return sortedSquares;
    }
}
