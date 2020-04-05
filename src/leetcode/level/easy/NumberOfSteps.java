package leetcode.level.easy;

import java.util.Scanner;

/**
 * 
 * 문제번호 : 1342번 
 * 문제제목 : Number of Steps to Reduce a Number to Zero
 * 문제링크 : https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 * 작 성 일 : 2020.04.05
 * 작 성 자 : YUN YOUNG
 * 문제내용 : Given a non-negative integer num, return the number of steps to reduce it to zero.
 * If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
 *
 */
public class NumberOfSteps {
	public int numberOfSteps (int num) {
		int count = 1;
		while (true) {
			if (num % 2 == 0) {
				num /= 2;
			} else {
				num -= 1;
			}
			if (num == 0) {
				break;
			}
			count++;
		}
		return count;
	}
}
