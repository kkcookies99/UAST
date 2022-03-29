class Solution {
    public boolean XXX(TreeNode root) {
        if ( root == null ) {
            return true;
        }
        return Math.abs(deepth(root.left)-deepth(root.right)) <= 1      // 当前层是平衡的 
            && XXX(root.left) && XXX(root.right);         // 孩子也是平衡的

    }
    int deepth(TreeNode root) {
        if ( root == null ) {
            return 0;
        }
        return Math.max(deepth(root.left)+1, deepth(root.right)+1);
    }
}

