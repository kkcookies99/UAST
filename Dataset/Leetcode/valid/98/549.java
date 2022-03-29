 class Solution {

    // 非递归
    public boolean XXX(TreeNode root) {
        if (root == null) return true;
        ArrayDeque<TreeNode> stk = new ArrayDeque<>();
        long prev = Long.MIN_VALUE;
        while (root != null || !stk.isEmpty()) {
            while (root != null) {
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            if (prev >= root.val) return false;
            else prev = root.val;
            root = root.right;
        }
        return true;
    }

    // dfs
    // TreeNode prev = null;
    // boolean res = true;

    // public boolean XXX(TreeNode root) {
    //     if (root == null) return true;
    //     dfs(root);
    //     return res;
    // }

    // void dfs(TreeNode root) {
    //     if (root == null) return;
    //     dfs(root.left);
    //     if (prev == null || prev.val < root.val) prev = root;
    //     else res = false;
    //     dfs(root.right);
    // }
}

