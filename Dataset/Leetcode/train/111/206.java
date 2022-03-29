class Solution {
    public int XXX(TreeNode root) {
        //根为空，则最小深度为0
        if (root == null ) return 0;
        //左右子树为空，最大深度为1
        if (root.left == null && root.right == null ) return 1;
        //左子树不为空 递归+1
        if (root.left != null && root.right == null) return XXX(root.left) + 1;
        if (root.right != null && root.left == null) return XXX(root.right) + 1;
        //求最小深度
        return Math.min(XXX(root.right), XXX(root.left)) + 1;
    }
}

