package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 442. Find All Duplicates in an Array
 */
public class FindAllDuplicatesInAnArray {
    static class Solution {
        public List<Integer> findDuplicates(int[] nums) {
            /**
             * if the value in the correct position for num has be changed then the num is duplicated
             */
            List<Integer> result = new ArrayList<>();
            for (int i = 0, length = nums.length; i < length; i++) {
                int realVal = nums[i];
                if (realVal > length) {
                    realVal = realVal - length;
                }

                if (nums[realVal - 1] > length) {
                    result.add(realVal);
                } else {
                    nums[realVal - 1] = nums[realVal - 1] + length;
                }
            }
            return result;
        }
    }
}
