class Solution {
    public int XXX(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int min = Integer.MAX_VALUE;
        // 左右节点分开讨论就是解决临界问题
        if (root.left != null) {
            min = XXX(root.left);
        }
        if (root.right != null) {
            min = Math.min(min, XXX(root.right));
        }
        return min + 1;
    }
}

