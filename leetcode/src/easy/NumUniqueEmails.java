package easy;

import java.util.HashSet;

/**
 * 929. Num Unique Emails
 */
public class NumUniqueEmails {
    static class Solution {
        public int numUniqueEmails(String[] emails) {
            HashSet<String> allEmails = new HashSet<>();
            for (String email: emails) {
                int sign = email.indexOf("@");
                int plus = email.indexOf("+") > 0 ? email.indexOf("+") : sign;
                String localName = email.substring(0, plus < sign ? plus : sign)
                        .replaceAll("\\.", "");
                String domainName = email.substring(sign);
                allEmails.add(localName.concat(domainName));
            }
            return allEmails.size();
        }
    }

    static class Solution2 extends Solution {
        @Override
        public int numUniqueEmails(String[] emails) {
             HashSet<String> allEmails = new HashSet<>();
             for (String email: emails) {
                 allEmails.add(email.replaceAll("\\.(?=\\S*@)|\\+.*(?=@)", ""));
             }
            return allEmails.size();
        }
    }
}
