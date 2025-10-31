package leetcode.level.easy;

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
public class BackspaceStringCompare2 {

    public static void main(String[] args) {
        System.out.println(backspaceCompare("nhn##", "n#h#n"));
        System.out.println(backspaceCompare("abc#d", "abzz##d"));
        System.out.println(backspaceCompare("a#c", "b"));
    }

    public static boolean backspaceCompare(String s1, String s2) {
        return build(s1).equals(build(s2));
    }

    private static String build(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
