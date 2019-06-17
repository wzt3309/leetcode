package easy;

import org.junit.Test;

import static easy.BracketList.*;
import static org.assertj.core.api.Assertions.assertThat;

public class BracketListTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        assertThat(solution.getBracketList(0).toString()).isEqualTo("[]");
        assertThat(solution.getBracketList(1).toString()).isEqualTo("[[]]");
        assertThat(solution.getBracketList(2).toString()).isEqualTo("[[[]], [][]]");
        assertThat(solution.getBracketList(3).toString()).isEqualTo("[[[[]]], [[][]], [[]][], [][[]], [][][]]");
    }

}