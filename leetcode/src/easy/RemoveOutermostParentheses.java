package easy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.function.BiConsumer;

/**
 * 1021. Remove Outermost Parentheses
 */
public class RemoveOutermostParentheses {

    static class Solution {
        public String removeOuterParentheses(String S) {
            if (S == null || "".equals(S)) {
                return "";
            }
            Deque<Character> stack = new ArrayDeque<>();
            List<String> decomps = new ArrayList<>();
            int st = 0, ed = st;
            BiConsumer<Integer, Integer> consumer = (beg, end) -> {
                if (end - beg > 2) {
                    decomps.add(S.substring(beg + 1, end - 1));
                } else {
                    decomps.add("");
                }
            };

            for (char c: S.toCharArray()) {
                if (c == '(') {
                    if (stack.isEmpty() && st != ed) {
                        consumer.accept(st, ed);
                        st = ed;
                    }
                    stack.push(c);
                    ed++;
                } else {
                    stack.pop();
                    ed++;
                }
            }
            consumer.accept(st, ed);
            return String.join("", decomps);
        }
    }

    static class BestSolution extends Solution {
        public String removeOuterParentheses(String S) {
            StringBuilder sbd = new StringBuilder();
            int opened = 0;
            for (char c: S.toCharArray()) {
                if (c == '(' && opened++ > 0) sbd.append(c);
                if (c == ')' && opened-- > 1) sbd.append(c);
            }
            return sbd.toString();
        }
    }
}
