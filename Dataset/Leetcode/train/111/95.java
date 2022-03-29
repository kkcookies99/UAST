class Solution {
    public int XXX(TreeNode root) {
        if (root==null) {
            return 0;
        }
        if(root.left == null && root.right!=null){
            return 1+XXX(root.right);
        }
        if (root.right == null && root.left!=null) {
            return 1+XXX(root.left);
        }
        return Math.min(1+XXX(root.left), 1+XXX(root.right));
    }
}