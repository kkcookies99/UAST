 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        List<Integer> l1 = new ArrayList<>();
        dfs(p, l1);

        List<Integer> l2 = new ArrayList<>();
        dfs(q, l2);

        return l1.equals(l2);
    }

    void dfs(TreeNode root, List<Integer> list) {
        list.add(root == null ? Integer.MAX_VALUE : root.val);

        if (root.left != null) {
            dfs(root.left, list);
        } else {
            list.add(Integer.MAX_VALUE);
        }
        if (root.right != null) {
            dfs(root.right, list);
        } else {
            list.add(Integer.MAX_VALUE);
        }
    }
}

