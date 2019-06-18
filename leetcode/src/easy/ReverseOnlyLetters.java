package easy;

/**
 * 917. Reverse Only Letters
 */
public class ReverseOnlyLetters {
    static class Solution {
        public String reverseOnlyLetters(String S) {
            char[] value = S.toCharArray();
            int i = 0, j = S.length() - 1;
            while (i < j) {
                if (!Character.isLetter(value[i])) {
                    i++;
                    continue;
                }
                if (!Character.isLetter(value[j])) {
                    j--;
                    continue;
                }
                char tmp = value[i];
                value[i++] = value[j];
                value[j--] = tmp;
            }
            return new String(value);
        }
    }
}
