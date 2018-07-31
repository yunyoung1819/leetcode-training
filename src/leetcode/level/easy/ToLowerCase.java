package leetcode.level.easy;

/**
 * Number : 709
 * Title : To Lower Case
 * Level : Easy
 * 
 * Problem : Implement function ToLowerCase() that has a string parameter str,
 * and returns the same string in lowercase.
 * 
 * Example 
 * Input : "Hello"
 * Output : "hello"
 * 
 */
public class ToLowerCase {
	public static void main(String[] args) {
		
		toLowerCase("Hello");
	}

	public static String toLowerCase(String str) {
		
		String lowerString = str.toLowerCase();
		
		return lowerString;
	}
}
