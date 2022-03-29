 class Solution {
    List<Integer>res=new ArrayList<>();
    public List<Integer> XXX(TreeNode root) {
        dfs(root);
        return res;
    }
    public void dfs(TreeNode root){
        if(root==null) return;
        dfs(root.left);
        res.add(root.val);
        dfs(root.right);
    }
}

