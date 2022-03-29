 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(res, root);
        return res;
    }
    public void dfs(List<Integer> res , TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        if(treeNode.left != null) dfs(res, treeNode.left);
        res.add(treeNode.val);
        if(treeNode.right != null) dfs(res, treeNode.right);
    }
}

