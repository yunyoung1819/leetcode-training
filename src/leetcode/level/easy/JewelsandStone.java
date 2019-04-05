package leetcode.level.easy;

/**
 * 
 * Problem : Jewels and Stone
 * Level : Easy
 * 
 * You're given strings J representing the types of stones that are jewels,
 * and S representing the stones you have. 
 * Each character in S is a type of stone you have. 
 * You want to know how many of the stones you have are also jewels.
 * 
 * The letters in J are guaranteed distinct, and all characters in J and S
 * are letters. Letteres are case sensitive, so "a" is considered a different type of stone from "A"
 * 
 * Example 1:
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 * 
 * Example 2:
 * Input: J = "z", S = "ZZ"
 * Output: 0
 * 
 * Note: S and J will consist of letters and have length at most 50. 
 * The characters in J are distinct.
 *
 */
public class JewelsandStone {
	public int numJewelsInStones(String J, String S) {
		
		char[] jewel = new char[J.length()];	
		char[] stone = new char[S.length()];	
		int count = 0;
		
		for (int i = 0; i < jewel.length; i++) {
			jewel[i] = J.charAt(i);
		}
		
		for (int j = 0; j < stone.length; j++) {
			stone[j] = S.charAt(j);
		}
		
		for (int i = 0; i < jewel.length; i++) {
			for (int j = 0; j < stone.length; j++) {
				if (jewel[i] == stone[j]) {
					count++;
				}
			}
		}
		
		return count;
	}
}	
