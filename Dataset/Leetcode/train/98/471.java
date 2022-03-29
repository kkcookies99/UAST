 class Solution {
    public boolean XXX(TreeNode root) {
        return isv(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean isv(TreeNode root, long min, long max){
        return root==null||((root.val<max)&&(root.val>min) && isv(root.left,min,Math.min(max,root.val))&&isv(root.right,Math.max(min,root.val),max));
    }
}

