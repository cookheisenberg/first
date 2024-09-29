import java.util.*;

class Solution {

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int countOfSubstrings(String word, int k) {
        int n = word.length();
        int count = 0;

        for (int start = 0; start < n; start++) {
            Set<Character> vowelsSet = new HashSet<>();
            int consonantsCount = 0;

            for (int end = start; end < n; end++) {
                char c = word.charAt(end);

                if (isVowel(c)) {
                    vowelsSet.add(c);
                } else {
                    consonantsCount++;
                }

                if (vowelsSet.size() == 5 && consonantsCount == k) {
                    count++;
                }
            }
        }

        return count;
    }
}
