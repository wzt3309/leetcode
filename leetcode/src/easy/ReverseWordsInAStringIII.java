package easy;

/**
 * 557. Reverse Words in a String III
 */
public class ReverseWordsInAStringIII {
    static class Solution {
        public String reverseWords(String s) {
            StringBuilder sbd = new StringBuilder();
            String[] S = s.split(" ");
            for (String str: S) {
                sbd.append(reverseWord(str)).append(" ");
            }
            return sbd.toString().trim();
        }

        private String reverseWord(String str) {
            char[] s = str.toCharArray();
            int i = 0, j = s.length - 1;
            while (i < j) {
                char tmp = s[i];
                s[i] = s[j];
                s[j] = tmp;
                i++;
                j--;
            }
            return new String(s);
        }
    }
}
