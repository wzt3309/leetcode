package easy;

/**
 * 766. Toeplitz Matrix
 */
public class ToeplitzMatrix {
    static class Solution {
        public boolean isToeplitzMatrix(int[][] matrix) {
            int m = matrix.length, n = matrix[0].length;
            // Lower half of the matrix
            for (int i = 0; i < m; i++) {
                int s = matrix[i][0];
                int p = i, q = 0;
                while (p < m && q < n) {
                    if (matrix[p++][q++] != s) return false;
                }
            }
            // Upper half of the matrix
            for (int i = 1; i < n; i++) {
                int s = matrix[0][i];
                int p = 0, q = i;
                while (p < m && q < n) {
                    if (matrix[p++][q++] != s) return false;
                }
            }

            return true;
        }
    }
}
