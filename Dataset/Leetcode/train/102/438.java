class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(root, 0, result);

        return result;
    }

    public void dfs(TreeNode root, int level, List<List<Integer>> result) {
        if (root == null)
            return;

        if (result.size() == level)
            result.add(new ArrayList<Integer>());
        result.get(level).add(root.val);
        dfs(root.left, level + 1, result);
        dfs(root.right, level + 1, result);
    }
}

