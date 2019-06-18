package easy;

import java.util.Arrays;
import java.util.Iterator;

/**
 * 824. Goat Latin
 */
public class GoatLatin {
    static class Solution {
        public String toGoatLatin(String S) {
            String vowel = "aeiouAEIOU";
            String[] words = S.split(" ");
            StringBuilder suffix = new StringBuilder("ma");

            StringBuilder sbd = new StringBuilder();
            Iterator<String> iter = Arrays.asList(words).iterator();
            while (iter.hasNext()) {
                String word = iter.next();

                if (vowel.contains(String.valueOf(word.charAt(0)))) {
                    sbd.append(word);
                } else {
                    sbd.append(word, 1, word.length())
                       .append(word, 0, 1);
                }
                suffix.append("a");
                sbd.append(suffix);

                if (iter.hasNext()) {
                    sbd.append(" ");
                }
            }
            return sbd.toString();
        }
    }
}
