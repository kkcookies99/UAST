 class Solution {
    //首先想法仍然是递归
    // 跳出条件  本节点为空，或者确定了非BST
    public boolean XXX(TreeNode root) {
        return XXX(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public boolean XXX(TreeNode root,long lower,long upper) {
        if(root == null) return true;
        if(root.val >= upper || root.val <= lower) return false;
        return XXX(root.left,lower,root.val) && XXX(root.right,root.val,upper);
    }
}

