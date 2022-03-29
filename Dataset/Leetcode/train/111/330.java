class Solution {
    public int XXX(TreeNode root) {
        if(root == null)return 0;
        if(root.left == null && root.right != null)return 1+XXX(root.right);
        if(root.left != null && root.right == null)return 1+XXX(root.left);
        return 1+Math.min(XXX(root.right),XXX(root.left));
    }
}

