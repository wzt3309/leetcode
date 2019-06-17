package easy;

/**
 * 867. Transpose Matrix
 */
public class TransposeMatrix {
    static class Solution {
        public int[][] transpose(int[][] A) {
            int m = A.length, n = A[0].length;
            int[][] B = new int[n][m];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    B[j][i] = A[i][j];
                }
            }
            return B;
        }
    }
}
