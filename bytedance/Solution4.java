import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] D = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                D[i][j] = Integer.MAX_VALUE;
                D[j][i] = Integer.MAX_VALUE;
            }
        }

        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            D[u - 1][v - 1] = w;
            D[v - 1][u - 1] = w;
        }

        int q = sc.nextInt();
        int[] res = new int[q];
        for (int i = 0; i < q; i++) {
            res[i] = sc.nextInt();
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int tmp = (D[i][k] == Integer.MAX_VALUE || D[k][j] == Integer.MAX_VALUE) ?
                            Integer.MAX_VALUE : (D[i][k] + D[k][j]);
                    if (D[i][j] > tmp) {
                        D[i][j] = tmp;
                    }
                }
            }
        }

        for (int i = 0; i < q; i++) {
            int pos = res[i];
            int[] dist = D[pos - 1];
            int max = 0;
            for (int d: dist) {
                if (d > max) {
                    max = d;
                }
            }
            System.out.println(max);
        }
    }
}
