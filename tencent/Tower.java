import java.util.*;

/**
 * 建造迪拜塔
 *
 */
public class Tower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<String> allRes = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            allRes.add(daily(arr, n));
        }
        Iterator<String> iter = allRes.iterator();
        while (iter.hasNext()) {
            String res = iter.next();
            if (iter.hasNext()) {
                System.out.println(res);
                continue;
            }
            System.out.print(res);
        }
    }

    private static String daily(int[] arr, int n) {
        Queue<Integer> repo = new PriorityQueue<>(Comparator.reverseOrder());
        StringBuilder res = new StringBuilder();
        int base = n;
        for (int i = 0; i < n; i++) {
            int wood = arr[i];
            if (wood < base) {
                repo.add(wood);
                res.append("\n");
                continue;
            }
            if (wood == base) {
                if (!repo.isEmpty()) {
                    StringBuilder sbf = new StringBuilder();
                    sbf.append(wood).append(" ");

                    base = base - 1;
                    while (!repo.isEmpty()) {
                        int k = repo.peek();
                        if (k == base) {
                            sbf.append(k).append(" ");
                            repo.poll();
                            base--;
                        } else {
                            break;
                        }
                    }
//                    // append repo
//                    Iterator<Integer> iter = repo.iterator();
//                    while (iter.hasNext()) {
//                        int k = iter.next();
//                        sbf.append(k);
//                        if (!iter.hasNext()) {
//                            base = k;
//                            break;
//                        }
//                        sbf.append(" ");
//                    }
                    sbf.deleteCharAt(sbf.length() - 1);
                    res.append(sbf.toString()).append("\n");
//                    repo.clear();
                } else {
                    res.append(base).append("\n");
                    base = base - 1;
                }
            }
        }
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }
}
