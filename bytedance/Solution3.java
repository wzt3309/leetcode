import java.util.Collections;
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] reg = new int[n];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            reg[i] = sc.nextInt();
            if (reg[i] - min < 0) {
                min = reg[i];
            }
        }

        int sum = 0;
        for (int r: reg) {
           sum += r / min;
           if (r % min != 0) {
               sum += 1;
           }
        }
        System.out.println(sum);
    }


}
