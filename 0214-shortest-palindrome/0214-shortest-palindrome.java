public class Solution {
    public String shortestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        
        int n = s.length();
        int longestPalindromePrefixLength = 0;
        
        // Check all prefixes to find the longest palindrome prefix
        for (int i = n; i >= 1; i--) {
            if (isPalindrome(s, 0, i - 1)) {
                longestPalindromePrefixLength = i;
                break;
            }
        }
        
        // The remaining suffix after the palindrome prefix needs to be added in reverse order
        String suffix = s.substring(longestPalindromePrefixLength);
        String reversedSuffix = new StringBuilder(suffix).reverse().toString();
        
        return reversedSuffix + s;
    }
    
    private boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
}
