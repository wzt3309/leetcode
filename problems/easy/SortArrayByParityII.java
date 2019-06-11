package easy;

/**
 * 922. Sort Array By Parity II
 */
public class SortArrayByParityII {
    static class Solution {
        public int[] sortArrayByParityII(int[] A) {
            int[] B = new int[A.length];
            int i = 0, j = 0;
            for (int a: A) {
                if (a % 2 == 0) B[2*i++] = a;
                else B[2*(j++)+1] = a;
            }
            return B;
        }
    }
}
