package leetcode.level.easy;

/**
 * title: 14. Longest Common Prefix
 * date: 2025.09.25
 * author: yun young
 * link: https://leetcode.com/problems/longest-common-prefix/description/?envType=problem-list-v2&envId=array
 *
 * description: Write a function to find the longest common prefix string
 * amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * output: "fl"
 *
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * output: ""
 *
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String first = strs[0];
        for (int i = 0; i < first.length(); i++) {
            char c = first.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return first.substring(0, i);
                }
            }
        }
        return first;
    }
}
