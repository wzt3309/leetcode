package easy;

import org.junit.Test;

import static easy.SquaresOfASortedArray.Solution;
import static org.assertj.core.api.Assertions.assertThat;

public class SquaresOfASortedArrayTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        int[] A = {-4,-1,0,3,10};
        int[] actual = solution.sortedSquares(A);
        assertThat(actual).containsExactly(0,1,9,16,100);

        A = new int[]{-7,-3,2,3,11};
        actual = solution.sortedSquares(A);
        assertThat(actual).containsExactly(4,9,9,49,121);
    }

}