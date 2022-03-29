class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null)
            return true;
        if(root.left == null && root.right == null)
            return true;
        // 判断其左右子树是否平衡
        if(Math.abs(treeHeight(root.left) - treeHeight(root.right)) > 1)
            return false;
        // 递归判断其左右子树的子树是否平衡
        return XXX(root.left) && XXX(root.right);
    }
    
    public int treeHeight(TreeNode root) {
        if(root == null)
            return 0;
        int lh = treeHeight(root.left) + 1;
        int rh = treeHeight(root.right) + 1;
        return lh  > rh ? lh : rh;
    }
}

