class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) {
            return true;
        }
        int left = dfs(root.left,0);
        int right = dfs(root.right,0);
        //不仅root要是平衡的，左右子树也要递归判断
        if(Math.abs(left-right)<=1 && XXX(root.left) && XXX(root.right)) {
            return true;
        }
        return false;
    }
    //递归求子树最大树高
    public int dfs(TreeNode root,int depth) {
        if(root==null) {
            return depth;
        }
        depth +=1;
        int left = dfs(root.left,depth);
        int right = dfs(root.right,depth);
        return Math.max(left,right);
    }
}

