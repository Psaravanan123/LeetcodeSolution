public class Solution {
    public boolean rotateString(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        String concatenated = A + A;
        return concatenated.contains(B);
    }
}
