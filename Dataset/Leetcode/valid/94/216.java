 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        dfs(root, ret);
        return ret;
    }
    public void dfs(TreeNode node ,List<Integer> ret){
        TreeNode temp = node;
        if(node == null){
            return;
        }
        if(node.left != null){
            dfs(node.left, ret);
        }
        ret.add(node.val);
        if(node.right != null){
            dfs(node.right,ret);
        }
        
    }
}

