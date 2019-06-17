package easy;

public class SortArrayByParity {
    static class Solution {
        public int[] sortArrayByParity(int[] A) {
            int i = 0, j = A.length - 1;
            while (i < j) {
                if (A[i] % 2 == 1) {
                    swap(A, i, j--);
                } else {
                    i++;
                }
            }
            return A;
        }

        private void swap(int[] A, int i, int j) {
            int tmp = A[i];
            A[i] = A[j];
            A[j] = tmp;
        }
    }
}
