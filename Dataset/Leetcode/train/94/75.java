 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(list, root);
        return list;
    }

    public void dfs(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(list, root.left);
        list.add(root.val);
        dfs(list, root.right);
    }
}