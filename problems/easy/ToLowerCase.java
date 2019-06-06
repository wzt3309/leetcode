package easy;

/**
 * 709. To Lower Case
 */
public class ToLowerCase {
    static class Solution {
        public String toLowerCase(String str) {
            StringBuilder sbd = new StringBuilder();
            for (char c: str.toCharArray()) {
                if (c >= 'A' && c <= 'Z') {
                    c += ('a' - 'A');
                }
                sbd.append(c);
            }
            return sbd.toString();
        }
    }
}
