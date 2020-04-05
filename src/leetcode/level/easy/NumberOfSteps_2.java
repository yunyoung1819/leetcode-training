package leetcode.level.easy;

/**
 * 
 * 문제번호 : 1342번 
 * 문제제목 : Number of Steps to Reduce a Number to Zero
 * 문제링크 : https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 * 작 성 일 : 2020.04.05
 * 작 성 자 : YUN YOUNG
 * 문제내용 : Given a non-negative integer num, return the number of steps to reduce it to zero.
 * if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1
 *
 */
public class NumberOfSteps_2 {
	public int numberOfSteps (int n) {
		if (n == 0) {
			return 0;
		}
		return 1 + numberOfSteps(n % 2 == 0 ? n / 2 : n - 1);
	}
}
