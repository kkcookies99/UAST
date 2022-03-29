class Solution {
    public int XXX(TreeNode root) {
        if(root == null)return 0;
        if(root.left == null)return 1 + XXX(root.right);
        if(root.right == null)return 1 + XXX(root.left);
        return 1 + Integer.min(XXX(root.left),XXX(root.right));
    }
}

