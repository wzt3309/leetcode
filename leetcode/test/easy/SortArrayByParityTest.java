package easy;

import org.junit.Test;

import static easy.SortArrayByParity.Solution;
import static org.assertj.core.api.Assertions.assertThat;

public class SortArrayByParityTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        int[] A = {3,1,2,4};
        int[] actual = solution.sortArrayByParity(A);
        int[] expected = {4,2,1,3};
        assertThat(actual).containsExactly(expected);
    }

}