package medium;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Optional;

/**
 * 950. Reveal Cards In Increasing Order
 */
public class RevealCardsInIncreasingOrder {
    static class Solution {
        public int[] deckRevealedIncreasing(int[] deck) {
            int N = deck.length;
            Deque<Integer> index = new LinkedList<>();
            for (int i = 0; i < N; ++i)
                index.add(i);

            int[] ans = new int[N];
            Arrays.sort(deck);
            for (int card: deck) {
                ans[Optional.ofNullable(index.pollFirst()).orElse(0)] = card;
                if (!index.isEmpty())
                    index.add(index.pollFirst());
            }

            return ans;
        }
    }
}
