package easy;


import org.junit.Test;

import static easy.RemoveOutermostParentheses.*;
import static org.assertj.core.api.Assertions.assertThat;

public class RemoveOutermostParenthesesTest {
    @Test
    public void testSolution() {
       test(new Solution());
    }

    @Test
    public void testBestSolution() {
        test(new BestSolution());
    }

    private void test(Solution solution) {
        String s1 = "(()())(())", as1 = "()()()";
        assertThat(solution.removeOuterParentheses(s1)).isEqualTo(as1);

        String s2 = "(()())(())(()(()))", as2 = "()()()()(())";
        assertThat(solution.removeOuterParentheses(s2)).isEqualTo(as2);

        String s3 = "()()", as3 = "";
        assertThat(solution.removeOuterParentheses(s3)).isEqualTo(as3);
    }
}