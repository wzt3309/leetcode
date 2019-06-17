package easy;

import org.junit.Test;

import static easy.FlippingAnImage.*;
import static org.assertj.core.api.Assertions.*;

public class FlippingAnImageTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        int[][] A = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] B = solution.flipAndInvertImage(A);
        int[][] excepted = {{1,0,0},{0,1,0},{1,1,1}};
        for (int i = 0; i < A.length; i++) {
            assertThat(B[i]).containsExactly(excepted[i]);
        }
    }

}