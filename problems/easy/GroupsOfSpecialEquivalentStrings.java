package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 893. Groups of Special-Equivalent Strings
 */
public class GroupsOfSpecialEquivalentStrings {
    static class Solution {
        public int numSpecialEquivGroups(String[] A) {
            Set<String> seen = new HashSet<>();
            for (String S: A) {
                int[] count = new int[52]; // odd and even index of letters
                for (int i = 0; i < S.length(); i++) {
                    // slip the odd and even index letters, before 26 in count is for even, after 26 is for odd
                    // if the even or odd index has the same count letters, the S = T
                    count[S.charAt(i) - 'a' + 26 * (i % 2)]++;
                }
                seen.add(Arrays.toString(count));
            }
            return seen.size();
        }
    }
}
