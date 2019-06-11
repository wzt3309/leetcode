package easy;

/**
 * 999. Available Captures for Rook
 */
public class AvailableCapturesForRook {
    static class Solution {
        public int numRookCaptures(char[][] board) {
            int iRook = 0;
            int jRook = 0;

            for (int i = 0; i < board.length; i++)
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j] == 'R') {
                        iRook = i;
                        jRook = j;
                    }
                }

            int countPawns = 0;
            //RIGHT
            if (iRook != board.length) {
                for (int i = iRook + 1; i < 8; i++) {
                    if (board[i][jRook] == 'B')
                        break;
                    else if (board[i][jRook] == 'p') {
                        countPawns++;
                        break;
                    }
                }
            }
            //LEFT
            if (iRook != 0) {
                for (int i = iRook - 1; i > 0; i--) {
                    if (board[i][jRook] == 'B')
                        break;
                    else if (board[i][jRook] == 'p') {
                        countPawns++;
                        break;
                    }
                }
            }
            //UP
            if (jRook != board.length) {
                for (int j = jRook + 1; j < 8; j++) {
                    if (board[iRook][j] == 'B')
                        break;
                    else if (board[iRook][j] == 'p') {
                        countPawns++;
                        break;
                    }
                }
            }
            //DOWN
            if (jRook != 0) {
                for (int j = jRook - 1; j > 0; j--) {
                    if (board[iRook][j] == 'B')
                        break;
                    else if (board[iRook][j] == 'p') {
                        countPawns++;
                        break;
                    }
                }
            }

            return countPawns;
        }
    }
}
