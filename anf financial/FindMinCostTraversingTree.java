import java.util.*;
import java.util.stream.Collectors;

/**
 * 查找树形结构中，从根结点到叶节点的代价最小的路径
 *
 *             5
 *          6    7
 *        9   10  3
 *      12  23  0  20
 *    8   10  11  16  8
 *
 *    样例输入：
 *      5,6,7,9,10,3,12,23,0,20,8,10,11,16,8,
 *    样例输出：
 *      26
 *      5 7 3 0 11
 */
public class FindMinCostTraversingTree {

    private static Integer min = Integer.MAX_VALUE;
    private static String minPath = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // all number in one line
        Tree tree = constructTree(sc.nextLine());
        findMinCost(tree.root, new ArrayList<>());
        System.out.println(min);
        System.out.println(minPath);

    }

    private static void findMinCost(TreeNode root, List<TreeNode> path) {
        if (root == null) {
            return;
        }

        path.add(root);
        if (root.left == null && root.right == null) {
            int sum = path.stream().mapToInt(n -> n.value).sum();
            if (sum < min) {
                min = sum;
                minPath = path.stream().map(TreeNode::toString).collect(Collectors.joining(","));
            }
        }
        if (root.left != null) {
            findMinCost(root.left, path);
        }
        if (root.right != null) {
            findMinCost(root.right, path);
        }
        path.remove(path.size() - 1);
    }

    static class TreeNode {
        TreeNode left;
        TreeNode right;
        int value;

        TreeNode(String str) {
            if (str == null) {
                throw new IllegalArgumentException();
            }
            this.value = Integer.valueOf(str);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    static class Tree {
        TreeNode root;

        Tree(TreeNode root) {
            this.root = root;
        }
    }

    private static Tree constructTree(String input) {
        if (input == null || input.isEmpty()) {
            return new Tree(null);
        }

        String[] seq = input.split(",");
        List<TreeNode> treeNodes = new ArrayList<>();
        for (String e: seq) {
            treeNodes.add(new TreeNode(e));
        }

        int level = 1;
        int st = 0;
        int ed = st + level;
        for (; ed < treeNodes.size(); ++level, st = ed, ed = st + level) {
            int childIdx = ed;
            for (int i = st; i < ed; i++) {
                TreeNode treeNode = treeNodes.get(i);
                treeNode.left = treeNodes.get(childIdx);
                if (++childIdx < treeNodes.size()) {
                    treeNode.right = treeNodes.get(childIdx);
                }
            }
        }

        return new Tree(treeNodes.get(0));
    }

}
