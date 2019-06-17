package easy;

/**
 * 657. Robot Return to Origin
 */
public class RobotReturnToOrigin {
    static class Solution {
        public boolean judgeCircle(String moves) {
            int x = 0, y = 0;
            for (char move: moves.toCharArray()) {
                switch (move) {
                    case 'U': x++; break;
                    case 'D': x--; break;
                    case 'L': y++; break;
                    case 'R': y--; break;
                }
            }
            return x == 0 && y == 0;
        }
    }
}
