package easy;

import org.junit.Test;

import static easy.NumUniqueEmails.*;
import static org.assertj.core.api.Assertions.assertThat;

public class NumUniqueEmailsTest {

    @Test
    public void testSolution() {
        test(new Solution());
    }

    @Test
    public void testSolution2() {
        test(new Solution2());
    }

    private void test(Solution solution) {
        String[] emails = {
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"};
        assertThat(solution.numUniqueEmails(emails)).isEqualTo(2);
    }

}