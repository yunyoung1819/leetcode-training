package leetcode.level.easy;

/**
 * 문제번호 : 961번 
 * 문제제목 : N-Repeated Element in Size 2N Array
 * 문제링크 : https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 * 작 성 일 : 2020.05.09
 * 작 성 자 : YUN YOUNG
 * 문제내용 : In a array of size 2N, there are N+1 unique elements, and exactly one of these elements
 * is repeated N times.
 * Return the element repeated N times.
 */
public class N_RepeatedElementInSize2NArray {
	public int repeatedNTimes(int[] A) {
		int repeatNumber = 0;
		
		for (int i = 0; i < A.length; i++) {
			for (int j = i+1; j < A.length; j++) {
				if (A[i] == A[j]) {
					repeatNumber = A[i];
				}
			}
		}
		return repeatNumber;
	}
}
