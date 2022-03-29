 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) {
            return true;
        }
        return XXX(root.left,root.right);
    }
    public boolean XXX(TreeNode r1,TreeNode r2) {
        //终止条件
        if(r1 == null && r2 == null) {
            return true;
        }
        if(r1 == null || r2 == null || r1.val != r2.val) {
            return false;
        }
        //当前阶段
        //返回值
        return XXX(r1.left,r2.right) && XXX(r1.right,r2.left);
    }
}

