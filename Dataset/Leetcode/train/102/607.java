class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
         List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root==null) return res;
        dfs(root,res,1);
        return res;

    }
    private void dfs(TreeNode root, List<List<Integer>> res, int level) {
        if (root==null) return;
        if (res.size()<level) {
            res.add(new ArrayList<Integer>());
            res.get(level-1).add(root.val);
        } else {
            res.get(level-1).add(root.val);
        }
        dfs(root.left, res, level+1);
        dfs(root.right, res, level+1);
    }
}

