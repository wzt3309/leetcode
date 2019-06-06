package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 771. Jewels and Stones
 */
class JewelsAndStones {
    /**
     * 32ms 6.06% & 34mb 100%
     */
    static class Solution {
        public int numJewelsInStones(String J, String S) {
            char[] arrJ = J.toCharArray();
            char[] arrS = S.toCharArray();
            int sum = 0;
            // this step waste time, because the S is very long
            Map<Character, Integer> dict = new HashMap<>();
            for (char c : arrS) {
                if (dict.computeIfPresent(c, (key, oldVal) -> ++oldVal) == null) {
                    dict.putIfAbsent(c, 1);
                }

            }

            for (char c : arrJ) {
                sum += dict.getOrDefault(c, 0);
            }
            return sum;
        }
    }

    /**
     * 1ms 99.46% & 36.9mb 87.95%
     */
    static class Solution2 extends Solution {
        @Override
        public int numJewelsInStones(String J, String S) {
            int sum = 0;
            HashSet<Character> jewels = new HashSet<>();
            // character in J is not duplicate, so J.length < 52
            for (int i = 0; i < J.length(); i++) {
                jewels.add(J.charAt(i));
            }
            // hashCode is very fast
            for (int i = 0; i < S.length(); i++) {
                if (jewels.contains(S.charAt(i))) {
                    sum++;
                }
            }
            return sum;
        }

    }
}
