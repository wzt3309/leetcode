package easy;

/**
 * 344. Reverse String
 */
public class ReverseString {
    static class Solution {
        public void reverseString(char[] s) {
            int i = 0, j = s.length - 1;
            while (i < j) {
                char tmp = s[i];
                s[i] = s[j];
                s[j] = tmp;
                i++;
                j--;
            }
        }
    }
}
