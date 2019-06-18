package easy;

/**
 * 521. Longest Uncommon Subsequence I
 */
public class LongestUncommonSubsequenceI {
    static class Solution {
        public int findLUSlength(String a, String b) {
            // if a = b , we can't find uncommon subsequence
            if (a.equals(b)) {
                return -1;
            }
            // if a != b, len(a) == len(b), the longest uncommon subsequence is a or b
            // if a != b, len(a) != len(b), the longest uncommon subsequence is longest one (a or b)
            return Math.max(a.length(), b.length());
        }
    }
}
