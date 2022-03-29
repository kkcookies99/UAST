 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if(root == null) return false;
        List<List<Integer>> res = new ArrayList();
        dfs(root, 0, sum, new ArrayList(), res);
        return res.size() > 0;
    }
    public void dfs(TreeNode root, int sum, int target, List curr, List res){
        if(root.left == null && root.right == null){
            curr.add(root.val);
            if(sum + root.val == target) res.add(new ArrayList(curr));
            return;
        }

        if(root.left != null){
            curr.add(root.val);
            dfs(root.left, sum + root.val, target, curr, res);
            curr.remove(curr.size() - 1);
        }
        if(root.right != null){
            curr.add(root.val);
            dfs(root.right, sum + root.val, target, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
}

