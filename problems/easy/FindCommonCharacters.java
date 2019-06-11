package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1002. Find Common Characters
 */
public class FindCommonCharacters {
    static class Solution {
        public List<String> commonChars(String[] A) {
           int[] local = new int[26];
           int[] global = new int[26];
           Arrays.fill(global, 101);  // A[i].length <= 100
           for (String a: A) {
               for (char c: a.toCharArray()) {
                   local[c - 'a']++;
               }
               for (int i = 0; i < 26; i++) {
                   global[i] = Math.min(global[i], local[i]);
                   local[i] = 0;
               }
           }

            List<String> res = new ArrayList<>();
            for (int i = 0; i < 26; i++) {
               while (global[i]-- > 0){
                    res.add(String.valueOf((char)('a' + i)));
                }
            }
            return res;
        }
    }
}
