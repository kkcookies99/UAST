 class Solution {
    public boolean XXX(TreeNode root) {
       return XXX(root, null, null);
    }
    //辅助函数
    public boolean XXX(TreeNode root, TreeNode min, TreeNode max) {
        //结束条件
        if (root == null) {
            return true;
        }
        if (min != null && root.val <= min.val) return false;
        if (max != null && root.val >= max.val) return false;

        //等价状态
        return  XXX(root.left, min, root) && XXX(root.right, root, max);
    }
}

