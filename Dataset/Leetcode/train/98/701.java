 class Solution {
    long max = (long)Integer.MIN_VALUE-1;

    public boolean XXX(TreeNode root) {   
        return LNR(root);
    }
    public boolean LNR(TreeNode root){
        if(root == null) return true;
        boolean res = LNR(root.left);
        if(root.val <= max) res = false;
        max = root.val;
        return res && LNR(root.right);
    }
}

