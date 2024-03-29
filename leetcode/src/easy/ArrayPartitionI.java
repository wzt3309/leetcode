package easy;

import java.util.Arrays;

/**
 * 561. Array Partition I
 */
public class ArrayPartitionI {
    static class Solution {
        public int arrayPairSum(int[] nums) {
            Arrays.sort(nums);
            int sum = 0;
            for (int i = 0; i < nums.length; i += 2) {
                sum += nums[i];
            }
            return sum;
        }
    }
}
