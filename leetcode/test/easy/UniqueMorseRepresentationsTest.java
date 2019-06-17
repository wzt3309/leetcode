package easy;

import org.junit.Test;

import static easy.UniqueMorseRepresentations.*;
import static org.assertj.core.api.Assertions.assertThat;

public class UniqueMorseRepresentationsTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        test(solution);
    }

    private void test(Solution solution) {
        String[] words = {"gin", "zen", "gig", "msg"};
        assertThat(solution.uniqueMorseRepresentations(words)).isEqualTo(2);
    }

}