package leetcode.level.easy;

/**
 * title: Valid Palindrome
 * date: 2025.09.26
 * author: yun young
 * link: https://leetcode.com/problems/valid-palindrome/description/?envType=problem-list-v2&envId=string
 * description: A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
 * and removing all non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise.
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";

        assert isPalindrome(s1);
        assert !isPalindrome(s2);
        assert isPalindrome(s3);
    }

    private static boolean isPalindrome(String s) {
        String str1 = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String str2 = new StringBuilder(str1).reverse().toString();
        return str1.equals(str2);
    }
}
