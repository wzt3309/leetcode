package easy;

import org.junit.Test;

import static easy.HeightChecker.Solution;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HeightCheckerTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        int[] heights = {1,1,4,2,1,3};
        int expected = 3;
        assertThat(solution.heightChecker(heights)).isEqualTo(expected);
    }

}