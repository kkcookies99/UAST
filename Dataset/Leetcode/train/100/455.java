 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        //深度优先
        //1.如果一个为空false,都为空true
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        //都不为空判断根节点和左右节点
        return (q.val == p.val) && XXX(p.left, q.left) && XXX(p.right, q.right);
    }
}

