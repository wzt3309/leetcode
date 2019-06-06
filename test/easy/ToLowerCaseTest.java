package easy;

import org.junit.Test;

import static easy.ToLowerCase.*;
import static org.assertj.core.api.Assertions.assertThat;

public class ToLowerCaseTest {

    @Test
    public void testSolution() {
        Solution solution = new Solution();
        test(solution, "HeLlO");
        test(solution, "");
        test(solution, "hello");
    }

    private void test(Solution solution, String str) {
        assertThat(solution.toLowerCase(str)).isEqualTo(str.toLowerCase());
    }
}