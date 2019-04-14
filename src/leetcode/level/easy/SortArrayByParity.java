package leetcode.level.easy;

/**
 * @Problem : 905. Sort Array By Parity
 * @Level : Easy
 * @Date : 2019.04.14
 * @author : yun young
 * @link : https://leetcode.com/problems/sort-array-by-parity/
 * 
 * @Task
 * Given an array A of non-negative integers, return an array consisting of all
 * the even elements of A, followed by all the odd elements of A.
 * You may return any answer array that satisfies this condition.
 * 
 *  @Example1
 *  Input : [3,1,2,4]
 *  Output : [2,4,3,1]
 *  The outtputts [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 *
 */
class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int[] answer = new int[A.length];
        int t = 0;
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                answer[t++] = A[i];
            }
        }
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 1) {
                answer[t++] = A[i];
            }
        }
        
        return answer;
    }
}