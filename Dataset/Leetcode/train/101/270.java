 class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null)return true;
        TreeNode lft=root.left,rgt=root.right;
        return dfs(lft,rgt);
    }
    boolean dfs(TreeNode lft,TreeNode rgt){
        if(lft==null&&rgt==null)return true;
        if(rgt==null)return false;
        if(lft==null)return false;
        if(lft.val!=rgt.val)return false;
        return dfs(lft.left,rgt.right)
        &&dfs(lft.right,rgt.left);
    }
}

