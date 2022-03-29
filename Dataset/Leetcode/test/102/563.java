class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(0, result, root);
        return result;
    }

    private void dfs(int level, List<List<Integer>> result, TreeNode root) {
        if (root == null) {
            return;
        }
        List<Integer> list;
        if (level == result.size()) {
            list = new ArrayList<>();
            result.add(list);
        } else {
            list = result.get(level);
        }
        list.add(root.val);
        level++;
        dfs(level, result, root.left);
        dfs(level, result, root.right);
    }
}

