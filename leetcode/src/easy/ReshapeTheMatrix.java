package easy;

/**
 * 566. Reshape the Matrix
 */
public class ReshapeTheMatrix {
    static class Solution {
        public int[][] matrixReshape(int[][] nums, int r, int c) {
            int m = nums.length, n = nums[0].length;
            if (m * n != r * c) return nums;
            int[][] reshaped = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    int count = i * c + j;
                    int p = count / n;
                    int q = count % n;
                    reshaped[i][j] = nums[p][q];
                }
            }
            return reshaped;
        }
    }
}
