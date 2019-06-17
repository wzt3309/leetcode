package easy;

import org.junit.Test;

import java.util.Arrays;

import static easy.SortArrayByParityII.Solution;
public class SortArrayByParityIITest {
    @Test
    public void test() {
        Solution solution = new Solution();
        int[] A = {4,2,5,7};
        System.out.println(Arrays.toString(solution.sortArrayByParityII(A)));
    }

}