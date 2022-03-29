class Solution {
    public int XXX(TreeNode root) {
        if(root==null) return 0 ;
        return 1 + Math.max(XXX(root.left),XXX(root.right));
    }
}

