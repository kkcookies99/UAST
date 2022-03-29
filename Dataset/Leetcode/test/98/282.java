 class Solution {
    public boolean XXX(TreeNode root) {
       return dfs(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean dfs(TreeNode node,long left,long right){
        if(node==null){
            return true;
        }
        if(node.val<left||node.val>right){
            return false;
        }
        if(dfs(node.left,left,node.val-1l)&&dfs(node.right,node.val+1l,right)){
            return true;
        }else{
            return false;
        }
    }
}

