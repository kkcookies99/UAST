public class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null){
            return true;
        }
        return Math.abs(depth(root.left) - depth(root.right)) <=1 && XXX(root.left) && XXX(root.right) ? true : false;
    }
    // 计算二叉搜索树的高度
    private int depth(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        return leftDepth > rightDepth ? 1 + leftDepth : 1 + rightDepth;
    }
}

