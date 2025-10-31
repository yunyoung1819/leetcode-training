package leetcode.level.easy;

import java.util.Stack;

/**
 * title: 844. Backspace String Compare
 * date: 2025.10.31
 * author: yun young
 * link: https://leetcode.com/problems/backspace-string-compare/description/
 * description: Given two strings s and t, return true if they are equal
 * when both are typed into empty text editors. '#' means a backspace character.
 *
 * Note that after backspacing an empty text, the text will continue empty.
 */
public class BackspaceStringCompare1 {

    public static void main(String[] args) {
        System.out.println(backspaceCompare("nhn##", "n#h#n"));
        System.out.println(backspaceCompare("abc#d", "abzz##d"));
        System.out.println(backspaceCompare("a#c", "b"));
    }

    public static boolean backspaceCompare(String s1, String s2) {
        return build(s1).equals(build(s2));
    }

    private static String build(String str) {
        Stack<Character> ans = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                if (!ans.isEmpty())  {
                    ans.pop();
                }
            } else {
                ans.push(str.charAt(i));
            }
        }
        return String.valueOf(ans);
    }
}
