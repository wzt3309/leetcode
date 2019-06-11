package easy;

/**
 * 509. Fibonacci Number
 */
public class FibonacciNumber {
    static class Solution {
        /* the example of DP */
        public int fib(int N) {
            if (N == 0) return 0;
            if (N == 1 || N == 2) return 1;

            int[] dp = new int[N+1];
            dp[0] = 0; dp[1] = 1; dp[2] = 1;
            for (int i = 3; i < N + 1; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            return dp[N];
        }
        /**
         * int a = b = 1
         * for (int i = 3; i < N + 1; i++) {
         *     int tmp = b;
         *     b += a;
         *     a = tmp;
         * }
         * return b
         */
    }
}
