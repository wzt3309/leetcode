package easy;

/**
 * 832. Flipping an Image
 */
public class FlippingAnImage {
    static class Solution {
        public int[][] flipAndInvertImage(int[][] A) {
            int[][] B = new int[A.length][];
            int i = 0;
            for (int[] row: A) {
                B[i] = new int[row.length];
                int j = row.length - 1;
                for (int x: row) {
                    B[i][j--] = (x == 1 ? 0 : 1);
                }
                i++;
            }
            return B;
        }
    }
}
