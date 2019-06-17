package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the pair number of brackets, the output all combination
 * for example given n=2  => {[[]], [][]}
 */
class BracketList {
    static class Solution {
        List<String> getBracketList(int n) {
            List<String> res = new ArrayList<>();
            if (n == 0) return res;

            dfs(0, 0, "", res, n);
            return res;
        }

        void dfs(int left, int right, String buffer, List<String> res, int n) {
            if (left == n && right == n) {
                res.add(buffer);
                return;
            }

            if (left < n) {
                dfs(left + 1, right, buffer + "[", res, n);
            }

            if (left > right) {
                dfs(left, right + 1, buffer + "]", res, n);
            }
        }
    }
}
