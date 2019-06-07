package easy;

/**
 * 977. Squares of a Sorted Array
 */
public class SquaresOfASortedArray {
    static class Solution {
        public int[] sortedSquares(int[] A) {
            int[] B = new int[A.length];
            // two pointers
            int beg = 0, end = A.length - 1;
            int i = B.length - 1;
            while (i >= 0) {
                // a is the biggest one in negative parts
                int a = A[beg] * A[beg];
                // b is the biggest one in positive parts
                int b = A[end] * A[end];
                if (a > b) {
                    B[i] = a;
                    beg++;
                } else {
                    B[i] = b;
                    end--;
                }
                i--;
            }
            return B;
        }
    }
}
