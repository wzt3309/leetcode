package easy;

import org.junit.Assert;
import org.junit.Test;

import static easy.KDiffPairsInAnArray.*;

public class KDiffPairsInAnArrayTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();

        int[] ex1 = {3, 1, 4, 1, 5};
        int k = 2;
        Assert.assertEquals(2, solution.findPairs(ex1, k));

        int[] ex2 = {1, 2, 3, 4, 5};
        k = 1;
        Assert.assertEquals(4, solution.findPairs(ex2, k));

        int[] ex3 = {1, 1, 1, 5, 4};
        k = 0;
        Assert.assertEquals(1, solution.findPairs(ex3, k));
    }

}