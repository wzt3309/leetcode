package easy;

/**
 * 1051. Height Checker
 */
public class HeightChecker {
    static class Solution {
        public int heightChecker(int[] heights) {
            int[] box = new int[101];
            for (int height: heights) {
                box[height] += 1;
            }

            int count = 0;
            int idx = 0;
            for (int i = 0; i < box.length; i++) {
                for (int j = 0; j < box[i]; j++) {
                   if (heights[idx++] != i) {
                       count++;
                   }
                }
            }

            return count;
        }
    }
}
