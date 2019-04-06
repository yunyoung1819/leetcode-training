package leetcode.level.easy;

/**
 * 
 * Problem : 709. To Lower Case
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
public class ToLowerCase {

	public String toLowerCase(String str) {   
		
        String lowerLetters = str.toLowerCase();
        
        return lowerLetters;
    }
}
