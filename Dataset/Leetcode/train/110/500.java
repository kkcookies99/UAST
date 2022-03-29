class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null){
            return true;
        }
        return Math.abs((root.left != null ? TreeDepth(root.left) : 0) - (root.right != null ? TreeDepth(root.right) : 0)) <= 1 && XXX(root.left) && XXX(root.right);
        // 求树最大的深度
    private static int TreeDepth(TreeNode root){
        return Math.max(root.left != null ? TreeDepth(root.left) + 1 : 1 , root.right != null ? TreeDepth(root.right) + 1 : 1);
    }
}

