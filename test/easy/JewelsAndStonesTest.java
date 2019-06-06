package easy;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static easy.JewelsAndStones.*;

public class JewelsAndStonesTest {
    @Test
    public void solutionTest() {
        Solution solution = new Solution();
        assertThat(3).isEqualTo(solution.numJewelsInStones("aA", "aAAbbbb"));
        assertThat(0).isEqualTo(solution.numJewelsInStones("z", "ZZ"));
    }

    @Test
    public void solution2Test() {
        Solution solution = new Solution2();
        assertThat(3).isEqualTo(solution.numJewelsInStones("aA", "aAAbbbb"));
        assertThat(0).isEqualTo(solution.numJewelsInStones("z", "ZZ"));
    }
}