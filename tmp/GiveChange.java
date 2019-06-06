import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Q: 找钱问题. 零钱面额"1, 5, 11" 给出钱总额,找最少的零钱数
 * Input: 15
 * Output: 1: 0, 5: 3, 11: 0
 * */
public class GiveChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] f = new int[n + 1][2];
        f[0][0] = f[0][1] = 0;
        for (int i = 1; i < n + 1; i++) {
            min(f, i, 1);
            if (i >= 5) min(f, i, 5);
            if (i >= 11) min(f, i, 11);
        }

        Map<Integer, Integer> res = new HashMap<Integer, Integer>() {{
            put(1, 0);
            put(5, 0);
            put(11, 0);
        }};
        while (n > 0) {
            int key = n - f[n][1];
            int num = res.get(key);
            res.put(key, num + 1);
            // give change and remain
            n = f[n][1];
        }

        System.out.println(
                String.format("1: %d, 5: %d, 11: %d",
                        res.get(1), res.get(5), res.get(11)));
    }

    private static void min(int[][] f, int i, int j) {
        if (j == 1 || f[i - j][0] + 1 < f[i][0]) {
            f[i][0] = f[i - j][0] + 1;
            f[i][1] = i - j;
        }
    }
}
