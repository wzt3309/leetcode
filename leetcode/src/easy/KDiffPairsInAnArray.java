package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 532. K-diff Pairs in an Array
 */
class KDiffPairsInAnArray {
    // 核心思想，对于数组类型的数据结构来说，可以通过将其转换成Hash表的方式，极大简化根据Value查找的时间复杂度
    static class Solution {
        public int findPairs(int[] nums, int k) {
            if (k < 0) {
                return 0;
            }
            Map<Integer, Integer> m = new HashMap<>();
            for (int num: nums) {
                m.put(num, m.getOrDefault(num, 0) + 1);
            }

            int count = 0;
            for (int i: m.keySet()) {
                // k == 0 找原数组中相似的
                if (k == 0 && m.get(i) > 1) count++;
                // k != 0 找存在 i+k 的
                if (k != 0 && m.get(i+k) != null) count++;
            }

            return count;
        }
    }
}
