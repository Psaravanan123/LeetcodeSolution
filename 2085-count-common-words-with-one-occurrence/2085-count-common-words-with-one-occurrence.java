import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int countWords(String[] words1, String[] words2) {
      

        int sum = 0;
        for (String word : words1) {
            int count1 = 0, count2 = 0;
            for (String w : words1) {
                if (word.equals(w)) {
                    count1++;
                }
            }
            for (String w : words2) {
                if (word.equals(w)) {
                    count2++;
                }
            }

            if (count1 == 1 && count2 == 1) {
                sum++;
            }
        }

        return sum;
    }
}
