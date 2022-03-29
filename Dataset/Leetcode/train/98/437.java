 class Solution {
    public boolean XXX(TreeNode root) {
        return DFS(root,Long.MAX_VALUE,Long.MIN_VALUE);
    }
    public boolean DFS(TreeNode root,long maxValue,long minValue){
        if(root == null) return true;
        if(root.val >= maxValue || root.val <= minValue) return false;
        return DFS(root.left,root.val,minValue) && DFS(root.right,maxValue,root.val);
    }
}

