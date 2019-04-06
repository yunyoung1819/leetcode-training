package leetcode.level.easy;

/**
 * 
 * Problem : 709. To Lower Case_2
 * Level : Easy
 * Date : 2019.04.06
 * Writer : Yun Young
 * 
 * Implement function ToLowerCase() that has a string parameter str,
 * and returns the same string in lowercase.
 * 
 * Example 1
 * Input : "Hello"
 * Output : "hello"
 * 
 * Example 2
 * Input : "here"
 * Output : "here"
 * 
 * Example 3
 * Input : "LOVELY"
 * Output : "lovely"
 *
 */
public class ToLowerCase_2 {
	public String toLowerCase(String str) {
		if (str == null || str.isEmpty()) {
			return str;
		}
		
		char[] chars = str.toCharArray();
		
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= 'A' && chars[i] <= 'Z') {
				chars[i] += 32;
			}
		}
		return new String(chars);
	}
}
