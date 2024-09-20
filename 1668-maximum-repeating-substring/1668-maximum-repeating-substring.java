public class Solution {
    public int maxRepeating(String sequence, String word) {
        int k = 0;
        StringBuilder repeatedWord = new StringBuilder();
        while (true) {
            k++;
            repeatedWord.append(word);
            if (!sequence.contains(repeatedWord.toString())) {
                break;
            }
        }

        return k - 1; 
    }
}