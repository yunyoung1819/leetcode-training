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
public class BackspaceStringCompare {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c"));
        System.out.println(backspaceCompare("ab##", "c#d#"));
        System.out.println(backspaceCompare("a#c", "b"));
        System.out.println(backspaceCompare("c##vnvr", "#c##vnvr"));
    }

    private static boolean backspaceCompare(String s, String t) {
        return parsingString(s).equals(parsingString(t));
    }

    private static String parsingString(String str) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(str.charAt(i));
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
