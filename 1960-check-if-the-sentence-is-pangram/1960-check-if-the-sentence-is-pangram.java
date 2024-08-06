class Solution {
    public boolean checkIfPangram(String sentence) {
        for (int i = 97; i <= 122; i++) { // ASCII values for lowercase 'a' to 'z'
            char ch = (char) i;
            if (sentence.contains(Character.toString(ch))) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
